package com.thunisoft.microserviceprovider3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProvider3Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProvider3Application.class, args);
    }

}
