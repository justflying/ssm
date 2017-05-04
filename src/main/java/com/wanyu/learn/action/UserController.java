package com.wanyu.learn.action;

import com.wanyu.learn.domain.UserT;
import com.wanyu.learn.service.IUserTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * Created by Administrator on 2017/4/28.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserTService userTService;
    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request,Model model){
              int id = Integer.parseInt(request.getParameter("id"));
              UserT user  = this.userTService.getUserTById(id);
              model.addAttribute("user",user);
              model.addAttribute("complain","the fucking SSM go shit");
              return "showUser";
    }
}
