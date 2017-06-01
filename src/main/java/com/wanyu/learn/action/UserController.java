package com.wanyu.learn.action;


import com.wanyu.learn.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Created by Administrator on 2017/4/28.
 */
@Controller
@RequestMapping("/shiro")
public class UserController {

   @RequestMapping("/loginAdmin")
   public String login(User user,Model model){
          Subject subject = SecurityUtils.getSubject();
          UsernamePasswordToken  usernamePasswordToken =
                  new UsernamePasswordToken(user.getUsername(),user.getPassword());
          try{
              subject.login(usernamePasswordToken);
              /*
                 这里不能直接return "admin" 因为SpringMVC的配置  前缀是"/"
                 它会寻找同级别的目录。导致出问题，实际上资源所在的目录是/WEB-INF/jsp/admin.jsp
               */
              return "WEB-INF/jsp/admin";
          }catch (Exception ex){
              model.addAttribute("error","用户名或密码错误");
              /*
               * 这里不能直接使用 return "login"理论上是可以跳转到页面，然后一切正常，
               * 但实际会产生的问题是jq的静态资源会被拦截，导致页面无法加载脚本
               */
              return "redirect:/login";
          }

   }
    @RequestMapping("/admin")
    public String admin(){
        return "WEB-INF/jsp/admin";
    }

    @RequestMapping("/student")
    public String student(){
        return "WEB-INF/jsp/admin";
    }

    @RequestMapping("/teacher")
    public String teacher(){
        return "WEB-INF/jsp/admin";
    }
}
