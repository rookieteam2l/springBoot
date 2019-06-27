package com.sunshine.free.entity;

/**
 * @author  free
 * @date 2019-06-20
 */

public class User {
    private String userId;
    private String username;
    private String password;
    private String mobileNum;

    private String projectStatus;
    private String rate;
    private String term;
    private String repayment;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getRepayment() {
        return repayment;
    }

    public void setRepayment(String repayment) {
        this.repayment = repayment;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", projectStatus='" + projectStatus + '\'' +
                ", rate='" + rate + '\'' +
                ", term='" + term + '\'' +
                ", repayment='" + repayment + '\'' +
                '}';
    }
}
