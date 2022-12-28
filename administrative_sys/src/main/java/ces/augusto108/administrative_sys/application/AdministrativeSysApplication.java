package ces.augusto108.administrative_sys.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdministrativeSysApplication {
	public static void main(String[] args) {
		SpringApplication.run(AdministrativeSysApplication.class, args);
	}
}
