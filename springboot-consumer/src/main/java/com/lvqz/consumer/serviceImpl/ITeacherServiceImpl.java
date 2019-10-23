package com.lvqz.consumer.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lvqz.dubbo.domain.Teacher;
import com.lvqz.dubbo.service.TeacherService;

/**
 * @author: lvqz
 * @date: 2019/10/23
 * @time: 17:27
 */
@Service
public class ITeacherServiceImpl implements TeacherService {
    @Override
    public Teacher getTeacher() {
        System.out.println("提供者调用TeacherService");
        return new Teacher();
    }
}
