package com.sanqianxuan.spring;

import com.sanqianxuan.spring.service.UserService;
import com.sanqianxuan.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kirch
 * @version 1.0
 * @since 2020/6/23 15:12
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHi();
    }
}
