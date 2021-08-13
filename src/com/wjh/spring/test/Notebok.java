package com.wjh.spring.test;

public class Notebok implements Computer {
    @Override
    public void start() {
        System.out.println("开机");
    }

    @Override
    public void work() {
        System.out.println("工作");
    }

    @Override
    public void stop() {
        System.out.println("关机");
    }
}
