package com.wanyu.learn.test;

/**
 * Created by Administrator on 2017/4/26.
 */
public class HelloServiceImp implements HelloService {
    public void sayHello(String name) {
        System.err.println("Hello " +name);
    }
}
