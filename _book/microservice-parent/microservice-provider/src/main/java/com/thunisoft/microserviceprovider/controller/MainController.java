package com.thunisoft.microserviceprovider.controller;

import com.thunisoft.microservicecom.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser() {
        logger.info("do some work");
        User user = new User(1, "zjy", 21);
        return user;
    }
}
