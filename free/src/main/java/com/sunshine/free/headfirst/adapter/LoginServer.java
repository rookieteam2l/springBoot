package com.sunshine.free.headfirst.adapter;

/**
 * 原本可以的登陆注册。
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public class LoginServer {

    public void regist(String username,String password) {
        System.out.println("注册：" + username + "-" + password);
    }

    public void login(String username,String password) {
        System.out.println("登陆：" + username + "-" + password);
    }
}
