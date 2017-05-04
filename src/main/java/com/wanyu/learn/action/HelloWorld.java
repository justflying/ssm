package com.wanyu.learn.action;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;


/**
 * Created by Administrator on 2017/3/13.
 */
@Controller
public class HelloWorld implements EnvironmentAware{
    HttpServlet httpServlet=null;
    private Environment environment=null;
    public void setEnvironment(Environment environment) {
        this.environment=environment;
    }
    @RequestMapping(value="/helloWorld")
    public String helloWorld(){
        System.out.println("Hello World---");
        return "success";
    }
}
