package com.example.gs.panmengquan.http;


import com.example.gs.panmengquan.bean.LoginDataBean;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by GaoSheng on 2016/9/13.
 * 网络请求的接口都在这里
 */

public interface HttpService {
    //登录接口
    @POST("login?")
    Observable<LoginDataBean> login(@Query("number") String username);
}
