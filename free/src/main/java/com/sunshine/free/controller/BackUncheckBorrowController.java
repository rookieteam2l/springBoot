package com.sunshine.free.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunshine.free.utils.CommonResponse;
import com.sunshine.free.utils.ResponseTypeEnums;
import com.sunshine.free.vo.MdLoanVO;
import com.sunshine.free.entity.MdLoan;
import com.sunshine.free.service.MdLoanService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * @Description 未审核借款
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/borrow/uncheckBorrow")
public class BackUncheckBorrowController {

    @Autowired
    MdLoanService mdLoanService;

    @RequestMapping(value = "/getUncheckBorrow")
    public String getUncheckBorrow(Model model , MdLoanVO mdLoanVO,@RequestParam(defaultValue = "1") Integer pageNum){

        PageHelper.startPage(pageNum,10);
        mdLoanVO.setApprovalStatus("1");
        List<MdLoan> mdLoan = mdLoanService.getMdLoan(mdLoanVO);
        PageInfo<MdLoan> pageInfo = new PageInfo<>(mdLoan);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("mdLoan",mdLoanVO);
        return "uncheck_borrow";
    }

    @RequestMapping("/updateApprovalStatus")
    @ResponseBody
    public CommonResponse updateApprovalStatus(String[] mdLoanIds ,String approvalStatus){

        int i = mdLoanService.updateApprovalStatus(mdLoanIds, approvalStatus);
        System.out.println(i+"------"+mdLoanIds.length);
        return new CommonResponse<>(ResponseTypeEnums.SUCCESS,null,null,null);
    }
}
