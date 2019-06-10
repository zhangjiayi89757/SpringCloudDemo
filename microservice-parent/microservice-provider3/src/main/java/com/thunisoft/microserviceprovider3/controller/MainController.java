package com.thunisoft.microserviceprovider3.controller;

import com.thunisoft.microservicecom.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser() {
        User user = new User(3, "zjy", 21);
        return user;
    }
}
