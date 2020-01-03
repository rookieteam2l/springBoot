package com.sunshine.free.dao;

import com.sunshine.free.vo.MdLoanVO;
import com.sunshine.free.entity.MdLoan;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @Description MdLoanMapper
 * @author Free
 * @date 2019-07-01
 */

@Mapper
public interface MdLoanMapper {

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

    /**
     * 功能描述: 批量更新借款状态
     * @param mdLoanId
     * @return int
     * @author Free
     * @date 2019/8/1 16:38
     */
    int updateApprovalStatus(String[] mdLoanId,String approvalStatus);
}
