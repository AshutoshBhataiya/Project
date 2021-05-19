package org.ahliunited.ws.custDetailFin.types.request;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

	
	 @Bean
	    public Jaxb2Marshaller marshaller(){
	        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
	        jaxb2Marshaller.setPackagesToScan("org.ahliunited.ws.custDetailFin");
	        return jaxb2Marshaller;
	    }
	 
	 @Bean
	    public SoapClient soapClient(Jaxb2Marshaller jaxb2Marshaller) {
		    SoapClient articleClient = new SoapClient();
	        articleClient.setDefaultUri("http://localhost/aub/CustInfoResponce.txt");
	        articleClient.setMarshaller(jaxb2Marshaller);
	        articleClient.setUnmarshaller(jaxb2Marshaller);
	        return articleClient;
	    }
}
