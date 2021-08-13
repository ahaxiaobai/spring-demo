package com.wjh.spring.service.impl;

import com.wjh.spring.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {


    @Override
    public void test() {
        System.out.println("调用了测试类的修改方法");
    }
}
