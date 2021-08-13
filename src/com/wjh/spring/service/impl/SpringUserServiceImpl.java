package com.wjh.spring.service.impl;

import com.wjh.spring.dao.SpringUserDao;
import com.wjh.spring.model.User;
import com.wjh.spring.service.SpringUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Service
public class SpringUserServiceImpl implements SpringUserService {

    @Autowired
    @Qualifier("springUserMysqlDaoImpl")
    private SpringUserDao springUserDao;

    @Override
    public User getUser(int id) {
        return springUserDao.getUser(id);
    }

}
