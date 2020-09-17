package org.example.service;

import org.example.pojo.Meeting;

/**
 * @program: duboo-demo
 * @description:
 * @author: zhugaopo
 * @slogan: 致敬大师、致敬未来的你.
 * @create: 2020-09-17 11:01
 */
public interface MeetingService {
    Meeting getMeetingAndUserById(Integer id);
}