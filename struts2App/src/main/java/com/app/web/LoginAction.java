package com.app.web;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class LoginAction implements Action {
    private String userName;
    private String password;
    @Override
    public String execute() throws Exception {
        // struts2使用Servlet提供的两种方式
        // 1.使用解耦的方式获取Session，将当前登录用户的信息保存在session
        Map<String, Object> session = ActionContext.getContext().getSession();
        // 将当前用户信息保存到session中
        session.put("loginUser", userName); // 等用于session.setAttribute("loginUser", userName)

        // 2.使用耦合的方式获取session, 此时必须依赖Servlet
//        HttpSession session = ServletActionContext.getRequest().getSession();
//        session.setAttribute("loginUser", userName);

        // 比较用户名和密码
        if ("admin".equals(userName) && "123456".equals(password)) {
            return SUCCESS; // 使用Action接口中的常量
        }
        return ERROR;
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
