package ces.augusto108.authentication_sys.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuthenticationSysApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthenticationSysApplication.class, args);
	}
}
