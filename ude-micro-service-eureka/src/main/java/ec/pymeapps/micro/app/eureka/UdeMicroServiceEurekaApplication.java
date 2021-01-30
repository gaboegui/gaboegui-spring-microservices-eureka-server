package ec.pymeapps.micro.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer habilita el proyecto como servidor de Eureka
 * 
 *  se tiene que configurara tambien el puerto en application.properties
 *  y se tiene que aumentar la dependencia de Eureka Client 
 *  en los servicios que se va a monitorear
 * 
 * @author Gabriel E. 
 *
 */

@EnableEurekaServer
@SpringBootApplication
public class UdeMicroServiceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdeMicroServiceEurekaApplication.class, args);
	}

}
