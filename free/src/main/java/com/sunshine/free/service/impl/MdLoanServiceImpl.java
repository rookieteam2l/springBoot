package com.sunshine.free.service.impl;

import com.sunshine.free.VO.MdLoanVO;
import com.sunshine.free.dao.MdLoanMapper;
import com.sunshine.free.entity.MdLoan;
import com.sunshine.free.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Free
 * @Date : Create in  2019-7-12
 * @Description: 还款service
 * @Modified By:
 * @Version: 1.0
 */

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private MdLoanMapper mdLoanMapper;

    @Override
    public int addLoan(MdLoanVO mdLoanVO) {
        return mdLoanMapper.addLoan(mdLoanVO);
    }

    @Override
    public List<MdLoan> getMdLoan(MdLoanVO mdLoanVO) {
        return mdLoanMapper.getMdLoan(mdLoanVO);
    }
}
