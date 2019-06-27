package com.thunisoft.miscroserviceprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MiscroserviceProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(MiscroserviceProvider2Application.class, args);
    }

}
