package com.sunshine.free.headfirst.adapter.adapter;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public class LoginForQQAdapter extends AbstractLogin {

    @Override
    public boolean support(Object object) {
        return object instanceof LoginForQQAdapter;
    }

    @Override
    public void login2(String username, String password) {
        System.out.println("===> qq");
        super.loginForRegist(username,null);
    }
}
