package com.wjh.spring.test;

import com.wjh.spring.dao.impl.SpringUserDaoImpl;
import com.wjh.spring.model.User;
import com.wjh.spring.service.SpringUserService;
import com.wjh.spring.service.impl.SpringUserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringUserService userService = applicationContext.getBean(SpringUserService.class);
        System.out.println(userService.getUser(12));
    }
}
