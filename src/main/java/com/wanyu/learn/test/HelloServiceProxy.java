package com.wanyu.learn.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/4/26.
 */
public class HelloServiceProxy implements InvocationHandler {

    private  Object target;
    public Object bind(Object target){
        this.target=target;
        //取得代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
        //jdk提供需要的接口
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("###################我是JDK动态代理##################");
        Object result =null;
        //反射方法前调用
        System.err.println("我准备说hello");
        //执行方法，相当于调用HelloServiceImp里面的sayHello()方法
        result = method.invoke(target,args);
        System.err.println("我说过hello了");
        return result;
    }
}
