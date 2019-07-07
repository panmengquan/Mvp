package com.example.gs.panmengquan.model;

import android.support.annotation.NonNull;

import com.example.gs.panmengquan.base.BaseModel;
import com.example.gs.panmengquan.bean.LoginDataBean;
import com.example.gs.panmengquan.mvp.ILoginModel;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by GaoSheng on 2016/11/26.
 * 20:53
 *
 * @VERSION V1.4
 * com.example.gs.panmengquan.model
 * 主要做一些数据处理呀,网路请求呀
 */

public class LoginModel extends BaseModel {
    public void login(@NonNull String username,@NonNull final ILoginModel infoHint) {
        if (infoHint == null)
            throw new RuntimeException("InfoHint不能为空");
        httpService.login(username)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginDataBean>() {
                    @Override
                    public void onCompleted() {

                    }
                    //通过接口产生信息回调
                    @Override
                    public void onError(Throwable e) {
                        infoHint.failInfo(e.toString());
                    }

                    @Override
                    public void onNext(LoginDataBean loginBean) {
                        infoHint.successInfo(loginBean.getCode()+"");
                    }
                });
    }
}
