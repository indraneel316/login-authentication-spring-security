package com.gkart.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GkartServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GkartServiceRegistryApplication.class, args);
	}

}
