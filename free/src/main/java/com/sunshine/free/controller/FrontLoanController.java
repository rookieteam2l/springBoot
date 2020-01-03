package com.sunshine.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 角色信息
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/user/role")
public class BackRoleController {


    @RequestMapping("/getRoleInfo")
    public String getRoleInfo(){

        return "role";
    }

}
