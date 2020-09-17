package org.example.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.example.pojo.Meeting;
import org.example.pojo.User;
import org.example.service.MeetingService;
import org.example.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @program: duboo-demo
 * @description:
 * @author: zhugaopo
 * @slogan: 致敬大师、致敬未来的你.
 * @create: 2020-09-17 15:14
 */

@Component
@Service
//@Service(version = "1.0.0",timeout = 10000,interfaceClass = UserService.class)
public class MeetingServiceImpl implements MeetingService {
    @Reference
    UserService userService;
    @Override
    public Meeting getMeetingAndUserById(Integer id) {
        User userById = userService.getUserById(1);
        Meeting meeting = new Meeting();
        meeting.setUser(userById).setId(1000).setCode("M10000").setGroup("sss");
        return meeting;
    }
}
