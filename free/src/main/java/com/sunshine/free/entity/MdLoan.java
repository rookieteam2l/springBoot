package com.sunshine.free.entity;


import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description 借款信息
 * @author Free
 * @date 2019-07-01
 */
public class MdLoan implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value="借款编码",dataType="String",name="id",example="3039a415993f4282b6fd70332982e695")
  private String id;
  @ApiModelProperty(value="用户编码",dataType="String",name="userId",example="001")
  private String userId;
  @ApiModelProperty(value="用户名",dataType="String",name="userName",example="3039a415993f4282b6fd70332982e695")
  private String userName;
  @ApiModelProperty(value="电话",dataType="String",name="telephone")
  private String telephone;
  @ApiModelProperty(value="地址",dataType="String",name="address")
  private String address;
  private double loanMoney;
  private String loanTerm;
  private Date loanTime;
  private String loanMode;
  private String loanUse;
  private String approvalStatus;
  private String loanStatus;
  private String reserve1;
  private String reserve2;
  private String reserve3;
  private String reserve4;
  private String reserve5;
  private String createId;
  private Date createTime;
  private String deleteStatus;
  private String enableStatus;
  private String updateId;
  private Date updateTime;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public double getLoanMoney() {
    return loanMoney;
  }

  public void setLoanMoney(double loanMoney) {
    this.loanMoney = loanMoney;
  }

  public String getLoanTerm() {
    return loanTerm;
  }

  public void setLoanTerm(String loanTerm) {
    this.loanTerm = loanTerm;
  }

  public Date getLoanTime() {
    return loanTime;
  }

  public void setLoanTime(Date loanTime) {
    this.loanTime = loanTime;
  }

  public String getLoanMode() {
    return loanMode;
  }

  public void setLoanMode(String loanMode) {
    this.loanMode = loanMode;
  }

  public String getLoanUse() {
    return loanUse;
  }

  public void setLoanUse(String loanUse) {
    this.loanUse = loanUse;
  }

  public String getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(String approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public String getLoanStatus() {
    return loanStatus;
  }

  public void setLoanStatus(String loanStatus) {
    this.loanStatus = loanStatus;
  }

  public String getReserve1() {
    return reserve1;
  }

  public void setReserve1(String reserve1) {
    this.reserve1 = reserve1;
  }

  public String getReserve2() {
    return reserve2;
  }

  public void setReserve2(String reserve2) {
    this.reserve2 = reserve2;
  }

  public String getReserve3() {
    return reserve3;
  }

  public void setReserve3(String reserve3) {
    this.reserve3 = reserve3;
  }

  public String getReserve4() {
    return reserve4;
  }

  public void setReserve4(String reserve4) {
    this.reserve4 = reserve4;
  }

  public String getReserve5() {
    return reserve5;
  }

  public void setReserve5(String reserve5) {
    this.reserve5 = reserve5;
  }

  public String getCreateId() {
    return createId;
  }

  public void setCreateId(String createId) {
    this.createId = createId;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getDeleteStatus() {
    return deleteStatus;
  }

  public void setDeleteStatus(String deleteStatus) {
    this.deleteStatus = deleteStatus;
  }

  public String getEnableStatus() {
    return enableStatus;
  }

  public void setEnableStatus(String enableStatus) {
    this.enableStatus = enableStatus;
  }

  public String getUpdateId() {
    return updateId;
  }

  public void setUpdateId(String updateId) {
    this.updateId = updateId;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String toString() {
    return "MdLoan{" +
            "id='" + id + '\'' +
            ", userId='" + userId + '\'' +
            ", userName='" + userName + '\'' +
            ", telephone='" + telephone + '\'' +
            ", address='" + address + '\'' +
            ", loanMoney=" + loanMoney +
            ", loanTerm='" + loanTerm + '\'' +
            ", loanTime=" + loanTime +
            ", loanMode='" + loanMode + '\'' +
            ", loanUse='" + loanUse + '\'' +
            ", approvalStatus='" + approvalStatus + '\'' +
            ", loanStatus='" + loanStatus + '\'' +
            ", reserve1='" + reserve1 + '\'' +
            ", reserve2='" + reserve2 + '\'' +
            ", reserve3='" + reserve3 + '\'' +
            ", reserve4='" + reserve4 + '\'' +
            ", reserve5='" + reserve5 + '\'' +
            ", createId='" + createId + '\'' +
            ", createTime=" + createTime +
            ", deleteStatus='" + deleteStatus + '\'' +
            ", enableStatus='" + enableStatus + '\'' +
            ", updateId='" + updateId + '\'' +
            ", updateTime=" + updateTime +
            '}';
  }
}
