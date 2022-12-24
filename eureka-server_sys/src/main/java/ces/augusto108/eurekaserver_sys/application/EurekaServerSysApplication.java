package ces.augusto108.eurekaserver_sys.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerSysApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerSysApplication.class, args);
	}
}

