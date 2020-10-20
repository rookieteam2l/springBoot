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
 * @Description 未还款信息
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/repayment/unRepayment")
public class BackUnRepaymentController {

    @Autowired
    MdLoanService mdLoanService;

    @RequestMapping("/getUnRepayment")
    public String getUnRepayment(Model model , MdLoanVO mdLoanVO, @RequestParam(defaultValue = "1") Integer pageNum){

        PageHelper.startPage(pageNum,10);
        mdLoanVO.setApprovalStatus("3");
        List<MdLoan> mdLoan = mdLoanService.getMdLoan(mdLoanVO);
        PageInfo<MdLoan> pageInfo = new PageInfo<>(mdLoan);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("mdLoan",mdLoanVO);
        return "unrepayment";
    }

}
