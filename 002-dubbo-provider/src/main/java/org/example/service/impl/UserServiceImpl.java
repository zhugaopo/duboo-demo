package org.example.service.impl;

import org.example.pojo.User;
import org.example.service.UserService;

/**
 * @program: duboo-demo
 * @description:
 * @author: zhugaopo
 * @slogan: 致敬大师、致敬未来的你.
 * @create: 2020-09-17 10:56
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Integer userId) {
        User user = new User();
        user.setUserNo(1).setAge(20).setUserName("朱高坡");
        return user;
    }
}