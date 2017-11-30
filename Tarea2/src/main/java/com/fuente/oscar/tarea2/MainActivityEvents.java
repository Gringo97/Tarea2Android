package com.fuente.oscar.tarea2;

import android.app.FragmentTransaction;

import com.fuente.oscar.mylibrary.fragments.LoginFragmentListener;
import com.fuente.oscar.mylibrary.fragments.RegisterFragmentListener;

/**
 * Created by oscar.fuente on 22/11/2017.
 */


public class MainActivityEvents implements LoginFragmentListener, RegisterFragmentListener, FireBaseAdmin.FireBaseAdminListener {
    private MainActivity mainActivity;

    public MainActivityEvents(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    @Override
    public void onClickLogin() {
        mainActivity.fireBaseAdmin.signIn(mainActivity.loginFragment.txtUser.getText().toString(),mainActivity.loginFragment.txtPass.getText().toString());

    }

    @Override
    public void onClickRegisterLog() {
        android.support.v4.app.FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
        transaction.hide(this.mainActivity.loginFragment);
        transaction.show(this.mainActivity.registerFragment);
        transaction.hide(this.mainActivity.inicioFragment);
        transaction.commit();

    }

    @Override
    public void onClickRegister() {
        mainActivity.fireBaseAdmin.loginWithEmailPass(mainActivity.registerFragment.txtEmail.getText().toString(),mainActivity.registerFragment.txtPass.getText().toString());
    }

    @Override
    public void onClickVolver() {
        android.support.v4.app.FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
        transaction.hide(this.mainActivity.registerFragment);
        transaction.show(this.mainActivity.loginFragment);
        transaction.hide(this.mainActivity.inicioFragment);
        transaction.commit();
    }


    @Override
    public void fireBaseAdminUserConnected(boolean blconnected) {
        if(blconnected){
            android.support.v4.app.FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
            transaction.hide(this.mainActivity.loginFragment);
            transaction.hide(this.mainActivity.registerFragment);
            transaction.show(this.mainActivity.inicioFragment);
            transaction.commit();
        }
    }

    @Override
    public void fireBaseAdminUserRegister(boolean blconnected) {
        System.out.println("-----------------------------------"+ blconnected);
        if (blconnected) {
            android.support.v4.app.FragmentTransaction transition = this.mainActivity.getSupportFragmentManager().beginTransaction();
            transition.hide(this.mainActivity.registerFragment);
            transition.hide(this.mainActivity.loginFragment);
            transition.show(this.mainActivity.inicioFragment);
            transition.commit();
        }
    }
}
