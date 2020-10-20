package com.sunshine.free.headfirst.adapter.adapter;

import com.sunshine.free.headfirst.adapter.LoginServer;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public abstract class AbstractLogin extends LoginServer implements Login {

    protected void loginForRegist(String username,String password) {
        super.regist(username,password);
        super.login(username,password);
    }

}
