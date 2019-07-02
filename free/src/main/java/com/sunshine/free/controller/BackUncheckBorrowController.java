package com.sunshine.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 未审核借款
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/borrow/uncheckBorrow")
public class BackUncheckBorrowController {


    @RequestMapping("/getUncheckBorrow")
    public String getUncheckBorrow(){

        return "uncheck_borrow";
    }

}
