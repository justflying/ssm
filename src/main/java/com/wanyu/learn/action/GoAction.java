package com.wanyu.learn.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/4/17.
 */
@Controller
public class GoAction {
    private final Log logger= LogFactory.getLog(GoAction.class);
    //处理HEAD类型的"/"请求
    @RequestMapping(value = {"/"},method={RequestMethod.HEAD})
    public String head(){
        return "success";
    }
    //处理GET类型的"/index" 和"/"请求
    @RequestMapping(value={"/index","/"},method = RequestMethod.GET)
    public String index(Model model) throws Exception{
        logger.info("====processed by index=====");
        model.addAttribute("msg","I Love WangQing");
        return "success";
    }

}
