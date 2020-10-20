package com.sunshine.free.headfirst.adapter.adapter;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public class LoginForWXAdapter extends AbstractLogin {

    @Override
    public boolean support(Object object) {
        return object instanceof LoginForWXAdapter;
    }

    @Override
    public void login2(String username, String password) {
        System.out.println("===> wx");
        super.loginForRegist(username,null);
    }
}
