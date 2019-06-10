package com.thunisoft.microserviceconsumer.controller;

import com.thunisoft.microservicecom.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 配置RestTemplate的bean
 * RestTemplate用于模拟发送REST的客户端请求
 */
@RestController
public class UserConsumerController {

    /**
     * 不再通过地址和端口调取其他微服务，
     * 而是根据微服务的名来调取应用
     * 运用了eureka的发现功能
     */
    // private static String REST_URL_PREFIX = "http://localhost:8002"; // microservice-provider
    private static String REST_URL_PREFIX = "http://microservicecloud-provider"; // 微服务名 spring-application-name

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/getUser")
    public User get() {
        User user = restTemplate.getForObject(REST_URL_PREFIX + "/getUser", User.class);
        return user;
    }
}
