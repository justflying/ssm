package com.wanyu.learn.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Created by Administrator on 2017/3/13.
 */
@Controller
public class HelloWorld {

    @RequestMapping(value="/helloWorld")
    public String helloWorld(){
        System.out.println("Hello World---");
        return "success";
    }
}
