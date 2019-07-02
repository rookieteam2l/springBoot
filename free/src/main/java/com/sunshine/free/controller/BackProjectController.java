package com.sunshine.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 项目管理
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/project")
public class BackProjectController {


    @RequestMapping("/getProject")
    public String getProject(){

        return "project";
    }

}
