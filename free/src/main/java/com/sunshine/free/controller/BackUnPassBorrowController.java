package com.sunshine.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 未通过借款
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/borrow/unPassBorrow")
public class BackUnPassBorrowController {


    @RequestMapping("/getUnPassBorrow")
    public String getUnPassBorrow(){

        return "unpass_borrow";
    }

}
