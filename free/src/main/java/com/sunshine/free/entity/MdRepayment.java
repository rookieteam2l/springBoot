package com.sunshine.free.entity;


public class MdRepayment {

  private String id;
  private String userId;
  private String userName;
  private String loanId;
  private double loanMoney;
  private double totalAmount;
  private double amountPaid;
  private java.sql.Timestamp paymentsTime;
  private String reserve1;
  private String reserve2;
  private String reserve3;
  private String reserve4;
  private String reserve5;
  private String createId;
  private java.sql.Timestamp createTime;
  private long deleteStatus;
  private long enableStatus;
  private String updateId;
  private java.sql.Timestamp updateTime;


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


  public String getLoanId() {
    return loanId;
  }

  public void setLoanId(String loanId) {
    this.loanId = loanId;
  }


  public double getLoanMoney() {
    return loanMoney;
  }

  public void setLoanMoney(double loanMoney) {
    this.loanMoney = loanMoney;
  }


  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }


  public double getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(double amountPaid) {
    this.amountPaid = amountPaid;
  }


  public java.sql.Timestamp getPaymentsTime() {
    return paymentsTime;
  }

  public void setPaymentsTime(java.sql.Timestamp paymentsTime) {
    this.paymentsTime = paymentsTime;
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


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getDeleteStatus() {
    return deleteStatus;
  }

  public void setDeleteStatus(long deleteStatus) {
    this.deleteStatus = deleteStatus;
  }


  public long getEnableStatus() {
    return enableStatus;
  }

  public void setEnableStatus(long enableStatus) {
    this.enableStatus = enableStatus;
  }


  public String getUpdateId() {
    return updateId;
  }

  public void setUpdateId(String updateId) {
    this.updateId = updateId;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}