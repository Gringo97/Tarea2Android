package com.fuente.oscar.mylibrary.fragments;

import android.view.View;

import com.fuente.oscar.mylibrary.R;

/**
 * Created by oscar.fuente on 22/11/2017.
 */

public class LoginFragmentEvents implements View.OnClickListener {
    private LoginFragment loginFragment;

    public LoginFragmentEvents(LoginFragment loginFragment) {
        this.loginFragment = loginFragment;
    }


    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.btnRegister){
            if(this.loginFragment.loginFragmentListener != null){
                this.loginFragment.loginFragmentListener.onClickRegisterLog();
            }
        }else if(v.getId()== R.id.btnLogin) {
            if (this.loginFragment.loginFragmentListener != null) {
                this.loginFragment.loginFragmentListener.onClickLogin();
            }
        }
    }

    public LoginFragment getLoginFragment() {
        return loginFragment;
    }

    public void setLoginFragment(LoginFragment loginFragment) {
        this.loginFragment = loginFragment;
    }
}
