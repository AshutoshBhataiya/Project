package org.ahliunited.ws.custDetailFin.types.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

 import org.ahliunited.ws.custDetailFin.types.request.Header;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AUB_MESSAGE")
@Component
public class RequestMessage {

	@Autowired
	private Header header;
	
	@Autowired
	private CustDetailInput custDetailInput;

	public String getXmlFile() {
		
		return "<AUB_MESSAGE><REQUEST_MESSAGE>"
			+ this.header.getXmlHeader()	
			+this.custDetailInput.getXmlCustDetailInput()
			+ "</REQUEST_MESSAGE></AUB_MESSAGE>";
	}
	
	public String getCdataFile()  {
    	return StringEscapeUtils.unescapeXml("<![CDATA[" + this.getXmlFile() + "]]>");
    }
	
}
