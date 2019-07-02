package com.sunshine.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 近一周用户使用信息
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/statistics/statisticsUser")
public class BackStatisticsUserController {


    @RequestMapping("/getStatisticsUser")
    public String getStatisticsUser(){

        return "statistics_user";
    }

}
