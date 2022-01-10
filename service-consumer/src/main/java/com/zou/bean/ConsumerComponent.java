package com.zou.bean;

import com.zou.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author: 邹祥发
 * @date: 2022/1/10 11:10
 */
@Component
public class ConsumerComponent {

    @Reference
    private HelloService helloService;

    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}