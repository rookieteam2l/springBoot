package com.sunshine.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Free
 * @date 2019-06-22
 */

@Controller
public class BackLoginController {


    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "loginOn")
    public String loginOn(){

        return "index";
    }

    @RequestMapping(value = "role")
    public String role(){

        return "role";
    }
}
