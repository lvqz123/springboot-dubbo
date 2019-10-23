package com.lvqz.consumer.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lvqz.dubbo.domain.User;
import com.lvqz.dubbo.service.UserService;
import org.junit.Test;

/**
 * @author: lvqz
 * @date: 2019/10/23
 * @time: 11:48
 */
public class SpringBootConsumer {

    @Reference
    private UserService userService;

    @Test
    public void test(){
        User userById = userService.getUserById();
        System.out.println(userById);

    }

}
