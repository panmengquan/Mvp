package com.example.gs.panmengquan.presenter;

import com.example.gs.panmengquan.model.LoginModel;
import com.example.gs.panmengquan.mvp.ILoginModel;
import com.example.gs.panmengquan.mvp.ILoginView;
/**
 * Created by GaoSheng on 2016/11/26.
 * 20:51
 *
 * @VERSION V1.4
 * com.example.gs.panmengquan.presenter
 */

public class LoginPresenter  implements ILoginModel {
    private  LoginModel model ;
    private ILoginView loginView;
    public void login(String name, ILoginView loginView) {
        this.loginView = loginView;
        if(model==null){
            model = new LoginModel();
        }
        model.login(name,this);
    }

    @Override
    public void successInfo(String str) {
        loginView.loginSuccess(str);
    }

    @Override
    public void failInfo(String str) {
        loginView.loginFail(str);
    }

}
