package com.louislee92.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryEurekaApp {

    public static void main(String[] args) {
        SpringApplication.run(RegistryEurekaApp.class, args);
    }
}
