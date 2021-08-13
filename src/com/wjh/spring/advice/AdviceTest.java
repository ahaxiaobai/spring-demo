package com.wjh.spring.advice;

import org.springframework.stereotype.Component;

@Component
public class AdviceTest {

    public void testBefore() {
        System.out.println("修改前的事务开启");
    }

    public void testAfter() {
        System.out.println("修改后的事务提交");
    }
}
