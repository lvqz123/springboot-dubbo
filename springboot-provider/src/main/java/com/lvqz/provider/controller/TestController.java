package com.lvqz.provider.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lvqz.dubbo.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: lvqz
 * @date: 2019/10/23
 * @time: 17:28
 */
@Controller
@RequestMapping("/testController")
public class TestController {

    @Reference
    private TeacherService teacherService;

    @RequestMapping("/test")
    @ResponseBody
    public String getTeacherService(){
        teacherService.getTeacher();
        return "服务提供者调用消费者的ITeacherServiceImpl";
    }
}
