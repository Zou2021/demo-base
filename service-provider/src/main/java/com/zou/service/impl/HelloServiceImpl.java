package com.zou.service.impl;

import com.zou.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: 邹祥发
 * @date: 2022/1/10 10:54
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello: " + name;
    }
}
