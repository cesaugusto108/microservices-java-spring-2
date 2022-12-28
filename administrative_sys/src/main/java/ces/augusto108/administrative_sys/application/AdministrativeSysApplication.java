package ces.augusto108.administrative_sys.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"ces.augusto108.administrative_sys.entities"})
@ComponentScan(basePackages = {"ces.augusto108.administrative_sys.*"})
//@EnableJpaRepositories(basePackages = {"ces.augusto108.administrative_sys.repositories"})
@EnableEurekaClient
public class AdministrativeSysApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdministrativeSysApplication.class, args);
    }
}
