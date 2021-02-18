package com.pjhuc.bean;

public class UserBean {

    private int userId;
    private String userName;
    private String userPs;
    private int userAge;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getUserPs() {
        return userPs;
    }

    public void setUserPs(String userPs) {
        this.userPs = userPs;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public UserBean(int userId, String userName, String userPs, int userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userPs = userPs;
        this.userAge = userAge;
    }

    public UserBean() {
    }
}
