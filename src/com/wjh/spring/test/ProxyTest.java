package com.wjh.spring.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {


    /**
     * 动态代理的实现方式：
     * 1：使用jdk的proxy动态代理（原业务类必须得实现业务接口,创建原业务接口的子实现类动态代理对象）
     * 2:使用cglib动态代理（创建原业务类的子类动态代理对象）
     * <p>
     * 当原业务类功能满足不了需求时，又不想改变源代码的时候，可以使用动态代理
     * 来实现功能增强（前置增强，后置增强，环绕增强等）
     */
    public static void main(String[] args) {
        /*
         * 原业务类,原业务类的接口类型,怎么帮你功能增强
         */
        Computer notebookPower = (Computer) Proxy.newProxyInstance(Notebok.class.getClassLoader(), Notebok.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //目标方法时 start方法,插上电源
                if (method.getName().contains("start")) {
                    System.out.println("电源已插入");
                }
                //反射执行原业务类的业务方法
                Notebok notebok = new Notebok();
                Object invoke = method.invoke(notebok, args);
                if (method.getName().contains("stop")) {
                    System.out.println("电源已拔出");
                }
                return invoke;
            }
        });
        notebookPower.start();
        notebookPower.work();
        notebookPower.stop();
    }
}
