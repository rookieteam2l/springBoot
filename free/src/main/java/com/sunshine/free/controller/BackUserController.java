package com.sunshine.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 用户信息
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/user/user")
public class BackUserController {


    @RequestMapping("/getUserInfo")
    public String getUserInfo(){

        return "user";
    }

}
