package com.gkart.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GkartApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GkartApiGatewayApplication.class, args);
    }

}
