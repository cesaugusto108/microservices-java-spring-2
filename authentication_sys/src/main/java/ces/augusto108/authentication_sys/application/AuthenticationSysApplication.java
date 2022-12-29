package ces.augusto108.authentication_sys.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "ces.augusto108.authentication_sys.*")
@EnableFeignClients(basePackages = "ces.augusto108.authentication_sys.*")
public class AuthenticationSysApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthenticationSysApplication.class, args);
	}
}

