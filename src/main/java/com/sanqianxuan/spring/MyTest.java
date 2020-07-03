package com.sanqianxuan.spring;

import com.sanqianxuan.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kirch
 * @version 1.0
 * @since 2020/6/23 15:12
 */
public class MyTest {

    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHi();

        logger.info("info level");
        logger.debug("debug level");
        logger.error("error level");
        logger.trace("trace level");
        logger.warn("warn level");

        String message = "test";

    }
}
