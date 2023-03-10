package ces.augusto108.finaid_payment_sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
public class FinAidPaymentSysApplication {
	public static void main(String[] args) {
		SpringApplication.run(FinAidPaymentSysApplication.class, args);
	}
}
