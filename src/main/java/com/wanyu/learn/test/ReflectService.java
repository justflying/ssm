package com.wanyu.learn.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/4/26.
 */
public class ReflectService {
      public void sayHello(String name){
         System.err.print("Hello " +name);
      }
      public static  void main(String [] args)
              throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
         Object service =Class.forName(ReflectService.class.getName()).newInstance();
         Method method =service.getClass().getMethod("sayHello",String.class);
         method.invoke(service,"WanYu");
      }
}
