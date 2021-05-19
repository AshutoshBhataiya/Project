package org.ahliunited;

import org.ahliunited.ws.custDetailFin.types.request.SoapClient;
import org.ahliunited.ws.custDetailFin.types.request.SoapConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AubCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AubCoreApplication.class, args);
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SoapConfig.class);
		SoapClient articleClient = annotationConfigApplicationContext.getBean(SoapClient.class);
		System.out.println(articleClient.build());
	}

}
