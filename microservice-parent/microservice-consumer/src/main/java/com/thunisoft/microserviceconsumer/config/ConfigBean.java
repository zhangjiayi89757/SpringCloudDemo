package com.thunisoft.microserviceconsumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced // 负载均衡实际：RestTemplate根据均衡算法进行调度不同地址上的同一个微服务的部署
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * 不指定策略时，默认是消费端“随机调用”提供端微服务的策略
     * 下面指定一下：“轮训策略”
     * 通过Ribbon的核心组件IRule定义查找消费端调用提供端微服务的策略
     * @return
     */
    @Bean
    public IRule myRule() {
        return new RoundRobinRule();
    }
}
