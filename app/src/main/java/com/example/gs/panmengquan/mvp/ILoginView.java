package com.example.gs.panmengquan.mvp;

public interface ILoginView {
    String getUserName();
    void loginSuccess(String str);

    void loginFail(String failMsg);
}
