package com.zou;

import com.zou.bean.ConsumerComponent;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

/**
 * @author: 邹祥发
 * @date: 2022/1/10 11:17
 */
public class AnnotationConsumerMain {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        //获取消费者组件
        ConsumerComponent service = context.getBean(ConsumerComponent.class);
        while (true) {
            System.in.read();
            String hello = service.sayHello("xiaozou");
            System.out.println("result：" + hello);
        }
    }

    @Configuration
    @PropertySource("classpath:/dubbo-consumer.properties")
    @ComponentScan(basePackages = "com.zou.bean")
    @EnableDubbo
    static class ConsumerConfiguration {

    }
}