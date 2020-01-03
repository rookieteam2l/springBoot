package com.sunshine.free.vo;
import com.sunshine.free.entity.MdLoan;

/**
 * @Description MdLoanVO
 * @author Free
 * @date 2019-07-01
 */
public class MdLoanVO extends MdLoan {

  private String code;
  private String minMoney;
  private String maxMoney;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMinMoney() {
    return minMoney;
  }

  public void setMinMoney(String minMoney) {
    this.minMoney = minMoney;
  }

  public String getMaxMoney() {
    return maxMoney;
  }

  public void setMaxMoney(String maxMoney) {
    this.maxMoney = maxMoney;
  }

  @Override
  public String toString() {
    return "MdLoanVO{" +
            "code='" + code + '\'' +
            ", minMoney='" + minMoney + '\'' +
            ", maxMoney='" + maxMoney + '\'' +
            '}';
  }
}
