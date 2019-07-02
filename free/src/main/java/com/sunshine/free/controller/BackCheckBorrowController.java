package com.sunshine.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 已审核借款
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/borrow/checkBorrow")
public class BackCheckBorrowController {


    @RequestMapping("/getCheckBorrow")
    public String getCheckBorrow(){

        return "check_borrow";
    }

}
