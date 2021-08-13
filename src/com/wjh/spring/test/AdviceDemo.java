package com.wjh.spring.test;

import com.wjh.spring.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceDemo {
    public static void main(String[] args) {
        //aop的实现原理
        /**
         * 通过切面设置切点，当满足切面表达式的目标类的方法被调用时，aop框架会拦截此次调用，
         * 然后会创建一个动态代理对象，之后先调用增强类的前置增强方法，再调用原业务类的业务方法，
         * 最后调用增强类的后置增强方法
         *
         * 动态代理的几种方式：
         * 1：基于jdk动态代理
         * 2:基于cglib动态代理
         */
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("aop.xml");
        //TestService是基于jdk的aop的动态代理对象，已经织入了增强的逻辑
        TestService bean = classPathXmlApplicationContext.getBean(TestService.class);
        bean.test();
    }
}
