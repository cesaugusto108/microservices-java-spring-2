package ces.augusto108.configserver_sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerSysApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerSysApplication.class, args);
	}
}