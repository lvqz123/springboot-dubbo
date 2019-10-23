package com.lvqz.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lvqz.dubbo.domain.User;
import com.lvqz.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lvqz
 * @date: 2019/10/23
 * @time: 12:12
 */
@RestController
@RequestMapping("/testController")
public class TestController {

    @Reference
    private UserService userService;

    @RequestMapping("/test")
    public String test(){
        User userById = userService.getUserById();
        System.out.println(userById);
        return "消费者调用提供者提供的IUserServiceImpl";
    }

   /* public static void main(String [] args){
        User userById = userService.getUserById();
        System.out.println(userById);
    }*/

}
