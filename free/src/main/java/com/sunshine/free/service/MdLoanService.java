package com.sunshine.free.service;

import com.sunshine.free.VO.MdLoanVO;
import com.sunshine.free.entity.MdLoan;

import java.util.List;

/**
 * @author : Free
 * @Date : Create in 14:57 2019-08-01
 * @Description: 还款页面
 * @Modified By:
 * @Version:
 */
public interface LoanService {

    /**
     * 新增借款申请
     *
     * @param mdLoanVO
     * @return MdLoan
     */
    int addLoan (MdLoanVO mdLoanVO);

    /**
     *  查询所有借款申请
     *
     * @param mdLoanVO
     * @return List<MdLoan>
     */
    List<MdLoan> getMdLoan(MdLoanVO mdLoanVO);

}
