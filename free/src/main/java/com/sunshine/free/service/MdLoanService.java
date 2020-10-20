package com.sunshine.free.service;

import com.sunshine.free.vo.MdLoanVO;
import com.sunshine.free.entity.MdLoan;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @author : Free
 * @Date : Create in 14:57 2019-08-01
 * @Description: 借款service
 * @Modified By:
 * @Version:
 */
@CacheConfig(cacheNames = "Mdloan")
public interface MdLoanService {

    /**
     * 功能描述: 新增借款申请
     * @param mdLoanVO
     * @return int
     * @author Free
     * @date 2019/8/1 15:09
     */
    int addLoan (MdLoanVO mdLoanVO);

    /**
     * 功能描述: 查询借款信息
     * @param mdLoanVO
     * @return List<MdLoan>
     * @author Free
     * @date 2019/8/1 15:09
     */
    //@Cacheable(key = "#p0") 缓存到redis
    List<MdLoan> getMdLoan(MdLoanVO mdLoanVO);

    /**
     * 功能描述: 更新借款状态
     * @param mdLoanVO
     * @return int
     * @author Free
     * @date 2019/8/1 16:28
     */
    //@CachePut(key = "#p0.id")
    int update(MdLoanVO mdLoanVO);

    /**
     * 功能描述: 批量更新借款状态
     * @param mdLoanId
     * @param approvalStatus
     * @return int
     * @author Free
     * @date 2019/8/1 16:38
     */
    //@CachePut(key = "#p0.id")
    int updateApprovalStatus(String[] mdLoanId,String approvalStatus);

}
