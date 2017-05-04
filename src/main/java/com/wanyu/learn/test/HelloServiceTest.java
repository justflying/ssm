package com.wanyu.learn.test;

/**
 * Created by Administrator on 2017/4/26.
 */
public class HelloServiceTest {
    public static void main(String args[]){
        HelloServiceProxy helloServiceProxy = new HelloServiceProxy();
        HelloService proxy  = (HelloService) helloServiceProxy.bind(new HelloServiceImp());
        proxy.sayHello("张三");
        test();
    }
    public static void test(){
        HelloServiceCglib helloServiceCglib = new HelloServiceCglib();
        HelloServiceImp1 helloServiceImp1  =(HelloServiceImp1) helloServiceCglib.getInstance(new HelloServiceImp1());
        helloServiceImp1.sayHello("李四");
    }
}
