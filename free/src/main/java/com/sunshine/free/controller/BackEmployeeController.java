package com.sunshine.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 后台用户信息
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/user/employee")
public class BackEmployeeController {


    @RequestMapping("/getEmployeeInfo")
    public String getEmployeeInfo(){

        return "employee";
    }

}
