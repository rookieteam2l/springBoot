package com.sunshine.free.service.impl;

import com.sunshine.free.vo.MdLoanVO;
import com.sunshine.free.dao.MdLoanMapper;
import com.sunshine.free.entity.MdLoan;
import com.sunshine.free.service.MdLoanService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Free
 * @Date : Create in  2019-7-12
 * @Description: 借款service
 * @Modified By:
 * @Version: 1.0
 */

@Service
public class MdLoanServiceImpl implements MdLoanService {

    @Autowired
    private MdLoanMapper mdLoanMapper;

    /**
     * 功能描述: 新增借款申请
     * @param mdLoanVO
     * @return int
     * @author Free
     * @date 2019/8/1 15:10
     */
    @Override
    public int addLoan(MdLoanVO mdLoanVO) {
        return mdLoanMapper.addLoan(mdLoanVO);
    }

    /**
     * 功能描述: 查询借款信息
     * @param mdLoanVO
     * @return List<MdLoan>
     * @author Free
     * @date 2019/8/1 15:11
     */
    @Override
    public List<MdLoan> getMdLoan(MdLoanVO mdLoanVO) {
        return mdLoanMapper.getMdLoan(mdLoanVO);
    }

    /**
     * 功能描述: 更新借款信息
     * @param mdLoanVO
     * @return int
     * @author Free
     * @date 2019/8/1 16:29
     */
    @Override
    public int update(MdLoanVO mdLoanVO) {
        return 0;
    }

    /**
     * 功能描述: 批量更新借款状态
     * @param mdLoanId
     * @return int
     * @author Free
     * @date 2019/8/1 16:38
     */
    @Override
    public int updateApprovalStatus(@Param("mdLoanId") String[] mdLoanId,@Param("approvalStatus") String approvalStatus) {
        return mdLoanMapper.updateApprovalStatus(mdLoanId,approvalStatus);
    }
}
