package eruka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"eruka.demo"})
@EnableEurekaServer
public class ErukaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErukaApplication.class, args);
	}
}
