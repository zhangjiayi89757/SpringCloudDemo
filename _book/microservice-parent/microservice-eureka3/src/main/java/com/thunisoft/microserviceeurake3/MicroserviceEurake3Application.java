package com.thunisoft.microserviceeurake3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEurake3Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurake3Application.class, args);
    }

}
