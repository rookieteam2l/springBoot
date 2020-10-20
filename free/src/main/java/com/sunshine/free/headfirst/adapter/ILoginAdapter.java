package com.sunshine.free.headfirst.adapter;

import com.sunshine.free.headfirst.adapter.adapter.Login;
import com.sunshine.free.headfirst.adapter.adapter.LoginForQQAdapter;
import com.sunshine.free.headfirst.adapter.adapter.LoginForWXAdapter;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public class ILoginAdapter implements ILogin {
    @Override
    public void loginForQQ(String openId) {
        // qq api
        processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public void loginForWX(String openId) {
        // wx api
        processLogin(openId, LoginForWXAdapter.class);
    }

    private void processLogin(String openId, Class<? extends Login> clazz) {
        System.out.println("===> 进入公用登陆逻辑");
        try {
            Login adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                adapter.login2(openId,null);
            }
        } catch (Exception e) {

        }
    }

}
