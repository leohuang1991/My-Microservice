package productservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"productservice.demo"})
//@EnableDiscoveryClient
public class ProductServiceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
