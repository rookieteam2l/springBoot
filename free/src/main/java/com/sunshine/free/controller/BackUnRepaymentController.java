package com.sunshine.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 未还款信息
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/repayment/unRepayment")
public class BackUnRepaymentController {


    @RequestMapping("/getUnRepayment")
    public String getUnRepayment(){

        return "unrepayment";
    }

}
