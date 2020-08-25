package com.app.web;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

public class NewLoginAction extends ActionSupport {
    private String userName;
    private String password;

    @Override
    public void validate() {
        // 判断用户是否为空
        if (StringUtils.isBlank(userName)) {
            // 参数1:key 自定义
            // 参数2:验证提示信息
            addFieldError("userName", "用户名不能为空");
        }

        if (StringUtils.isBlank(password)) {
            addFieldError("password", "密码不能为空");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
