package ces.augusto108.academic_sys.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"ces.augusto108.academic_sys.entities"})
@ComponentScan(basePackages = {"ces.augusto108.academic_sys.*"})
@EnableJpaRepositories(basePackages = {"ces.augusto108.academic_sys.repositories"})
public class AcademicSysApplication {
    public static void main(String[] args) {
        SpringApplication.run(AcademicSysApplication.class, args);
    }
}
