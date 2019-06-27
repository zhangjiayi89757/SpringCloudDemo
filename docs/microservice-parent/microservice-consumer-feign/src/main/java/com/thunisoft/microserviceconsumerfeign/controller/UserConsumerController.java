package com.thunisoft.microserviceconsumerfeign.controller;

import com.thunisoft.microservicecom.pojo.User;
import com.thunisoft.microserviceconsumerfeign.service.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConsumerController {

    private static final Logger logger = LoggerFactory.getLogger(UserConsumerController.class);

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/consumer/getUser")
    public User get() {
        logger.info("do some work");
        return consumerService.getUser();
    }
}
