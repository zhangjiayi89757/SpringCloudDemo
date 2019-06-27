package com.thunisoft.microserviceeurake2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEurake2Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurake2Application.class, args);
    }

}
