package com.sunshine.free.controller;

import com.sunshine.free.vo.MdLoanVO;
import com.sunshine.free.entity.MdLoan;
import com.sunshine.free.service.MdLoanService;
import com.sunshine.free.utils.CommonResponse;
import com.sunshine.free.utils.ResponseTypeEnums;
import com.sunshine.free.utils.StatusEnums;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @Description 角色信息
 * @author Free
 * @date 2019-07-01
 */

@Controller
@RequestMapping(value = "/loan/loan")
public class FrontLoanController {

    @Autowired
    private MdLoanService frontLoanService;

    @RequestMapping("/getUser")
    public @ResponseBody
    CommonResponse<MdLoan> getRoleInfo(){

        MdLoan mdLoan = new MdLoan();
        mdLoan.setUserName("张三");
        mdLoan.setTelephone("18623710001");
        mdLoan.setLoanMode("");
        mdLoan.setLoanUse("");
        return new CommonResponse<>(ResponseTypeEnums.SUCCESS,null,null,mdLoan);
    }

    @RequestMapping("/addLoan")
    public @ResponseBody CommonResponse addLoan(@RequestBody MdLoanVO mdLoanVO){

        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        mdLoanVO.setId(uuid);
        mdLoanVO.setCreateId("123");
        mdLoanVO.setDeleteStatus(StatusEnums.OK.getCode());
        mdLoanVO.setEnableStatus(StatusEnums.OK.getCode());
        mdLoanVO.setUpdateId("123");
        System.out.println(mdLoanVO);
        frontLoanService.addLoan(mdLoanVO);
        return new CommonResponse<>(ResponseTypeEnums.SUCCESS,null,null,null);
    }

    @RequestMapping("/getMdLoan")
    public @ResponseBody CommonResponse<List<MdLoan>> getMdLoan(@RequestBody MdLoanVO mdLoanVO){

        List<MdLoan> mdLoan = frontLoanService.getMdLoan(mdLoanVO);
        System.out.println(mdLoan);
        return new CommonResponse<>(ResponseTypeEnums.SUCCESS,null,null,mdLoan);
    }

}
