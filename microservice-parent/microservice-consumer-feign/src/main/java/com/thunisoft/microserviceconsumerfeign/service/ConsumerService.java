package com.thunisoft.microserviceconsumerfeign.service;

import com.thunisoft.microservicecom.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 针对每个微服务自行封装一些客户端类来包装这些依赖服务的调用
 */
@FeignClient(value = "microservicecloud-provider") // 3个provider微服务的名字
@Service // 解决无法自动注入的问题
public interface ConsumerService {

    @RequestMapping(value = "/getUser")
    User getUser();
}
