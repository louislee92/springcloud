package com.louislee92.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProviderAApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderAApp.class, args);
    }
}
