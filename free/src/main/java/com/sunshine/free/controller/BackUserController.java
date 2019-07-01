package com.sunshine.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Free
 * @date 2019-07-01
 */

@Controller
public class BackUserController {


    @RequestMapping("/user")
    public String user(){

        return "user";
    }

}
