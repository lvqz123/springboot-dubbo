package com.lvqz.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author: lvqz
 * @date: 2019/10/23
 * @time: 11:49
 */
@EnableDubbo
@SpringBootApplication
public class SpringBootConsumer {
    public static void main(String [] args){
        SpringApplication.run(SpringBootConsumer.class,args);
    }
}
