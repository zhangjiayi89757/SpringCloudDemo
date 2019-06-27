package com.thunisoft.microserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 表示microservice-provider微服务启动时就启动eureka的客户端，该客户端自动的把microservice-provider服务注册进microservice-eureka1中。
public class MicroserviceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderApplication.class, args);
    }

}
