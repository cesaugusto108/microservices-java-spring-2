package ces.augusto108.administrative_sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableEurekaClient
public class AdministrativeSysApplication implements CommandLineRunner {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(AdministrativeSysApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("BCrypt: " + passwordEncoder.encode("p@ZZw0Rd"));
    }
}
