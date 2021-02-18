package com.pjhuc.bean;

public class ParamBean {

    private String userName;
    private String userPs;

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

    public ParamBean() {
    }

    public ParamBean(String userName, String userPs) {

        this.userName = userName;
        this.userPs = userPs;
    }
}
