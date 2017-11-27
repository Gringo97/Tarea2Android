package com.fuente.oscar.tarea2;

import android.app.FragmentTransaction;

import com.fuente.oscar.mylibrary.fragments.LoginFragmentListener;
import com.fuente.oscar.mylibrary.fragments.RegisterFragmentListener;

/**
 * Created by oscar.fuente on 22/11/2017.
 */


public class MainActivityEvents implements LoginFragmentListener, RegisterFragmentListener {
    private MainActivity mainActivity;

    public MainActivityEvents(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    @Override
    public void onClickLogin() {

    }

    @Override
    public void onClickRegister() {
        android.support.v4.app.FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
        transaction.hide(this.mainActivity.getLoginFragment());
        transaction.show(this.mainActivity.getRegisterFragment());
        transaction.commit();

    }

    @Override
    public void onClickVolver() {
        android.support.v4.app.FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
        transaction.hide(this.mainActivity.getRegisterFragment());
        transaction.show(this.mainActivity.getLoginFragment());
        transaction.commit();
    }

    public MainActivity getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
}
