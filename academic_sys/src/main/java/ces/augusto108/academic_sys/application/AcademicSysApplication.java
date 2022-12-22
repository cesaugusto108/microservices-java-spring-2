package ces.augusto108.academic_sys.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages={"ces.augusto108.academic_sys.model.entities"})
public class AcademicSysApplication {
	public static void main(String[] args) {
		SpringApplication.run(AcademicSysApplication.class, args);
	}
}
