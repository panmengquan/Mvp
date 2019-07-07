package com.example.gs.panmengquan;


import android.app.Application;
import android.content.Context;

/**
 * Created by GaoSheng on 2016/9/13.
 * 应用,主要用来做一下初始化的操作
 */

public class MyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    /**
     * @return
     * 全局的上下文
     */
    public static Context getContext() {
        return mContext;
    }


}
