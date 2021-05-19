package org.ahliunited.ws.custDetailFin.types.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUST_DETAIL_FIN_RQ" /* ,propOrder={"MsgType"} */)
@Getter
@Setter
@Component
public class CustDetailInput {
	
	@XmlElement(required = true)
	private String detFlag="N";
	
	@XmlElement(required = true)
	private String inType="RMWBID";
	
	@XmlElement(required = true)
	private String inValue	="285041606203";

	public String getXmlDetFlag() {
		return (StringUtils.isEmpty(detFlag)) ? "<DetFlag/>" : "<DetFlag>"+detFlag+"</DetFlag>";
	}
	public String getXmlInType() {
		return (StringUtils.isEmpty(inType)) ? "<INPUT_TYPE/>" : "<INPUT_TYPE>"+inType+"</INPUT_TYPE>";
	}
	public String getXmlInValue() {
		return (StringUtils.isEmpty(inValue)) ? "<INPUT_VALUE/>" : "<INPUT_VALUE>"+inValue+"</INPUT_VALUE>";
	}
	
	public String getXmlCustDetailInput() {
		return "<RequestBody> <CUST_DETAIL_FIN_RQ>"
				+ this.getXmlDetFlag()
				+this.getXmlInType()
				+this.getXmlInValue()
				+ "</CUST_DETAIL_FIN_RQ></RequestBody>";
	}
}