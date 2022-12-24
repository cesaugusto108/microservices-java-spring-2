package ces.augusto108.finaid_payment_sys.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ces.augusto108.finaid_payment_sys.*"})
@EnableFeignClients(basePackages = {"ces.augusto108.finaid_payment_sys.*"})
public class FinAidPaymentSysApplication {
	public static void main(String[] args) {
		SpringApplication.run(FinAidPaymentSysApplication.class, args);
	}
}
