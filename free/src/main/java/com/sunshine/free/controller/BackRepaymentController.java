package com.sunshine.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 已还款信息
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/repayment/repayment")
public class BackRepaymentController {


    @RequestMapping("/getRepayment")
    public String getRepayment(){

        return "repayment";
    }

}
