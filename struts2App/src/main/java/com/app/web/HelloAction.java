package com.app.web;

import com.opensymphony.xwork2.Action;

/**
 * 控制器Action
 * 创建Action两种方式:1.实现Action接口 2.继承ActionSupport类
 */
public class HelloAction implements Action {
    // 定义变量，接收页面的用户名userName
    // 要求：属性名必须与input标签的name属性一致, 并且提供get,set方法
    private String userName;

    @Override
    public String execute() throws Exception {
        System.out.println("userName:" + userName);
        return "success"; // 返回值与result标签的name属性值一致
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
