package com.sunshine.free.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunshine.free.entity.MdLoan;
import com.sunshine.free.service.MdLoanService;
import com.sunshine.free.vo.MdLoanVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Description 未通过借款
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/borrow/unPassBorrow")
public class BackUnPassBorrowController {

    @Autowired
    MdLoanService mdLoanService;

    @RequestMapping("/getUnPassBorrow")
    public String getUnPassBorrow(Model model , MdLoanVO mdLoanVO, @RequestParam(defaultValue = "1") Integer pageNum){

        PageHelper.startPage(pageNum,10);
        mdLoanVO.setApprovalStatus("2");
        List<MdLoan> mdLoan = mdLoanService.getMdLoan(mdLoanVO);
        PageInfo<MdLoan> pageInfo = new PageInfo<>(mdLoan);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("mdLoan",mdLoanVO);
        return "unpass_borrow";
    }

}
