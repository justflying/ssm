package com.wanyu.learn.test;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/4/26.
 */
public class HelloServiceCglib implements MethodInterceptor{

    private Object target;
    public Object getInstance(Object target){
        this.target=target;
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        //回调方法
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.err.println("++++++++++++我是Cglib动态代理++++++++++");
        //反射前调用方法
        System.err.println("我准备说hello了");
        Object returnObj= methodProxy.invokeSuper(o,objects);
        return returnObj;
    }
}
