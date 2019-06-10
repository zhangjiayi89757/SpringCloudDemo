package com.thunisoft.microserviceconsumerfeign.controller;

import com.thunisoft.microservicecom.pojo.User;
import com.thunisoft.microserviceconsumerfeign.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConsumerController {


    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/consumer/getUser")
    public User get() {
        return consumerService.getUser();
    }
}
