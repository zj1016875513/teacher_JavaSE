package com.atguigu.test;

import java.io.Serializable;

public class User implements Serializable {

    private String loginId;
    private String loginPwd;

    public User() {
    }

    public User(String loginId, String loginPwd) {
        this.loginId = loginId;
        this.loginPwd = loginPwd;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginId='" + loginId + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                '}';
    }
}
