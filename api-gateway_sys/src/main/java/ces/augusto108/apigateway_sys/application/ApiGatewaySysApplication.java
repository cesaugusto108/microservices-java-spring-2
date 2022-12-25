package ces.augusto108.apigateway_sys.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ApiGatewaySysApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewaySysApplication.class, args);
	}
}
