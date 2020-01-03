package com.sunshine.free.entity;


import java.util.Date;

/**
 * @Description 收益记录信息
 * @author Free
 * @date 2019-07-01
 */
public class MdProfit {

  private String id;
  private String userId;
  private String userName;
  private double profitMoney;
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

  public double getProfitMoney() {
    return profitMoney;
  }

  public void setProfitMoney(double profitMoney) {
    this.profitMoney = profitMoney;
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
    return "MdProfit{" +
            "id='" + id + '\'' +
            ", userId='" + userId + '\'' +
            ", userName='" + userName + '\'' +
            ", profitMoney=" + profitMoney +
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
