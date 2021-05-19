package org.ahliunited.ws.custDetailFin.types.request;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

//import org.apache.commons.lang.StringUtils;

import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeader" /* ,propOrder={"MsgType"} */)
@Getter
@Setter
@Component
public class Header {
	
	@XmlElement(required = true)
	private String msgType="Request";
	
	@XmlElement(required = true)
	private String reqID="OFA";
	
	@XmlElement(required = true)
	private String funcID="CUST_DETAIL_FIN";
	
	@XmlElement(required = true)
	private String userID="ONLINE_FINANCE";
	
	@XmlElement(required = true)
	private String txnRef="AUBR34727970";
	
	@XmlElement(required = true)
	private String chSysID="1234";
	
	@XmlElement(required = true)
	private String sessLang="E";
	
	@XmlElement(required = true)
	private String txnDate="1619470888648";
	
	@XmlElement(required = true)
	private String custNIN="";
	
	@XmlElement(required = true)
	private String entID="AUBKW";
	
	@XmlElement(required = true)
	private String txnStatus="Y";
	
	@XmlElement(required = true)
	private String verNo="1";
	
	@XmlElement(required = true)
	private String sessToken="1619470888648";
	
   
	public String getXmlMsgType() {
		return (StringUtils.isEmpty(msgType)) ? "<MsgType/>" : "<MsgType>"+msgType+"</MsgType>";
	}
	public String getXmlReqID() {
		return (StringUtils.isEmpty(reqID)) ? "<ReqID/>" : "<ReqID>"+reqID+"</ReqID>";
	}
	public String getXmlFuncID() {
		return (StringUtils.isEmpty(funcID)) ? "<FuncID/>" : "<FuncID>"+funcID+"</FuncID>";
	}
	public String getXmlUserID() {
		return (StringUtils.isEmpty(userID)) ? "<UserID/>" : "<UserID>"+userID+"</UserID>";
	}
	public String getXmlTxnRef() {
		return (StringUtils.isEmpty(txnRef)) ? "<TxnRef/>" : "<TxnRef>"+txnRef+"</TxnRef>";
	}

	public String getXmlChSysID() {
		return (StringUtils.isEmpty(chSysID)) ? "<ChSysID/>" : "<ChSysID>"+chSysID+"</ChSysID>";
	}
	public String getXmlSessLang() {
		return (StringUtils.isEmpty(sessLang)) ? "<SessLang/>" : "<SessLang>"+sessLang+"</SessLang>";
	}
	public String getXmlTxnDate() {
		return (StringUtils.isEmpty(txnDate)) ? "<TxnDate/>" : "<TxnDate>"+txnDate+"</TxnDate>";
	}
	public String getXmlCustNIN() {
		return (StringUtils.isEmpty(custNIN)) ? "<CustNIN/>" : "<CustNIN>"+custNIN+"</CustNIN>";
	}
	public String getXmlEntID() {
		return (StringUtils.isEmpty(entID)) ? "<EntID/>" : "<EntID>"+entID+"</EntID>";
	}
	public String getXmlTxnStatus() {
		return (StringUtils.isEmpty(txnStatus)) ? "<TxnStatus/>" : "<TxnStatus>"+txnStatus+"</TxnStatus>";
	}
	public String getXmlVerNo() {
		return (StringUtils.isEmpty(verNo)) ? "<VerNo/>" : "<VerNo>"+verNo+"</VerNo>";
	}
	public String getXmlSessToken() {
		return (StringUtils.isEmpty(sessToken)) ? "<SessToken/>" : "<SessToken>"+sessToken+"</SessToken>";
	}
	
	
	public String getXmlHeader() {
		return "<RequestHeader>"
				+ this.getXmlMsgType()
				+this.getXmlReqID()
				+this.getXmlFuncID()
				+this.getXmlUserID()
				+this.getXmlTxnRef()
				+this.getXmlChSysID()
				+this.getXmlSessLang()
				+this.getXmlTxnDate()
				+this.getXmlCustNIN()
				+this.getXmlEntID()
				+this.getXmlTxnStatus()
				+this.getXmlVerNo()
				+this.getXmlSessToken()
				+ "</RequestHeader>";
	}
	
}