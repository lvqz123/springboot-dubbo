package com.lvqz.provider.serviceImpl;

import com.lvqz.dubbo.utils.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: lvqz
 * @date: 2019/10/23
 * @time: 14:39
 */
@Controller
@RequestMapping("/testController")
public class ControllerTest {


    private SpringUtils springUtils;

    @RequestMapping("/getBeans")
    @ResponseBody
    public void getBeans(){
        String[] beanDefinitionNames = springUtils.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

}
