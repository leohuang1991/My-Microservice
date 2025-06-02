package cus.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"cus.demo","cus.controller"})
//@EnableDiscoveryClient
@EnableFeignClients
public class customer3 {

	public static void main(String[] args) {
		SpringApplication.run(customer3.class, args);
		System.out.println("Hello");
	}
}
