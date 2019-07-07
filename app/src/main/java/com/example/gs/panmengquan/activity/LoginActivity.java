package com.example.gs.panmengquan.activity;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.gs.panmengquan.R;
import com.example.gs.panmengquan.base.BaseActivity;
import com.example.gs.panmengquan.mvp.ILoginView;

import butterknife.ButterKnife;
import butterknife.BindView;

public class LoginActivity extends BaseActivity implements ILoginView {

    @BindView(R.id.input_email)   //账号
            EditText inputEmail;
    @BindView(R.id.input_password) //密码
            EditText inputPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        btnLogin.setOnClickListener(this);
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void otherViewClick(View view) {
        if(!checkNull()){
            mPresenter.login(getUserName(),this);
        }
    }

    @Override
    public String getUserName() {
        return inputEmail.getText().toString().trim();
    }
    @Override
    public void loginSuccess(String str) {
        toast(str);
    }

    @Override
    public void loginFail(String failMsg) {
        toast(failMsg);
    }


    public boolean checkNull() {
        boolean isNull = false;
        if (TextUtils.isEmpty(getUserName())) {
            inputEmail.setError("账号不能为空");
            isNull = true;
        }
        return isNull;
    }

}
