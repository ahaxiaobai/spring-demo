package com.wjh.spring.dao.impl;

import com.wjh.spring.dao.SpringUserDao;
import com.wjh.spring.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
public class SpringUserDaoImpl implements SpringUserDao {
    @Override
    public User getUser(int id) {
        User user = new User();
        user.setId(id);
        user.setUsername("张三");
        user.setPassword("123456");
        return user;
    }
}
