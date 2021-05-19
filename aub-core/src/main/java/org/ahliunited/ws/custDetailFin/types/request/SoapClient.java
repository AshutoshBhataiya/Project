package org.ahliunited.ws.custDetailFin.types.request;

import org.ahliunited.ws.custDetailFin.ProcessRequestString;
import org.ahliunited.ws.custDetailFin.ProcessRequestStringResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class SoapClient extends WebServiceGatewaySupport {

	@Autowired
	private RequestMessage req;
	
	public ProcessRequestStringResponse build() {
		
	//	RequestMessage req =  new RequestMessage();
		String cdataSec= req.getCdataFile();		
		ProcessRequestString finalReq = new ProcessRequestString();		
		finalReq.setReq(cdataSec);
		
   //     webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        System.out.println(cdataSec);
        ProcessRequestStringResponse responce = (ProcessRequestStringResponse) getWebServiceTemplate().marshalSendAndReceive(finalReq);
        System.out.println(responce.getProcessRequestStringResult());
        return responce;
	}
	

}
