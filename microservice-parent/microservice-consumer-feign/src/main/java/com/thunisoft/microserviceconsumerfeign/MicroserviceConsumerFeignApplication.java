package com.thunisoft.microserviceconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.thunisoft.microserviceconsumerfeign.service")
public class MicroserviceConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerFeignApplication.class, args);
    }

}
