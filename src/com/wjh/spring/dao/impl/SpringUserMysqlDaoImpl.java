package com.wjh.spring.dao.impl;

import com.wjh.spring.dao.SpringUserDao;
import com.wjh.spring.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Repository
public class SpringUserMysqlDaoImpl implements SpringUserDao {
    @Override
    public User getUser(int id) {
        User user = new User();
        user.setId(id);
        user.setUsername("李四");
        user.setPassword("456789");
        return user;
    }
}
