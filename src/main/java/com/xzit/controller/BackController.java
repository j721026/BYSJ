package com.xzit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunxf on 2019/3/19.
 */

@Controller
public class BackController {
    @ResponseBody
    @RequestMapping("home.do")
    public String back(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("home.do")
    public String back2(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("home.do")
    public String back3(){
        return "index";
    }
}
