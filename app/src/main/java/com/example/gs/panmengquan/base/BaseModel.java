package com.example.gs.panmengquan.base;

import com.example.gs.panmengquan.http.HttpServiceUtils;
import com.example.gs.panmengquan.http.HttpService;

/**
 * Created by gaosheng on 2016/12/1.
 * 23:13
 * com.example.gs.panmengquan.base
 */

public class BaseModel  {
    protected static HttpService httpService;

    //初始化httpService
    static {
        httpService = HttpServiceUtils.getHttpService();
    }

}
