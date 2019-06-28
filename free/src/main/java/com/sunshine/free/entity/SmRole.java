package com.sunshine.free.entity;


import java.util.Date;

public class SmRole {

  private String id;
  private String roleCode;
  private String roleName;
  private String description;
  private String reserve1;
  private String reserve2;
  private String reserve3;
  private String reserve4;
  private String reserve5;
  private String createId;
  private Date createTime;
  private int deleteStatus;
  private int enableStatus;
  private String updateId;
  private Date updateTime;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getRoleCode() {
    return roleCode;
  }

  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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

  public int getDeleteStatus() {
    return deleteStatus;
  }

  public void setDeleteStatus(int deleteStatus) {
    this.deleteStatus = deleteStatus;
  }

  public int getEnableStatus() {
    return enableStatus;
  }

  public void setEnableStatus(int enableStatus) {
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
}
