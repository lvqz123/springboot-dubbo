package com.lvqz.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lvqz.dubbo.domain.User;
import com.lvqz.dubbo.service.UserService;

/**
 * @author: lvqz
 * @date: 2019/10/22
 * @time: 17:30
 */
@Service
public class IUserService implements UserService {
    @Override
    public User getUserById() {
        return new User(1,"服务提供者");
    }
}
