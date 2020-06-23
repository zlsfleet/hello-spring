package com.sanqianxuan.spring.service.impl;

import com.sanqianxuan.spring.service.UserService;
import org.springframework.aop.scope.ScopedProxyUtils;

/**
 * @author kirch
 * @version 1.0
 * @since 2020/6/23 15:09
 */
public class UserServiceImpl implements UserService {
    public void sayHi(){
        System.out.println("Hello Spring");
    }
}
