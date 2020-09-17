package org.example;

import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:consumer.xml"});
        UserService userService = (UserService)context.getBean("userService");
        User userById = userService.getUserById(1);
        System.out.println("userById = " + userById);
        context.start();
        System.in.read(); // 按任意键退出
    }
}
