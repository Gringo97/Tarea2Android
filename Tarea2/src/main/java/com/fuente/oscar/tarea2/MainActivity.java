package com.fuente.oscar.tarea2;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fuente.oscar.mylibrary.fragments.LoginFragment;
import com.fuente.oscar.mylibrary.fragments.RegisterFragment;

public class MainActivity extends AppCompatActivity {
    private LoginFragment loginFragment;
    private RegisterFragment registerFragment;
    private MainActivityEvents mainActivityEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.loginFragment = (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.LoginFragment);
        this.registerFragment = (RegisterFragment) getSupportFragmentManager().findFragmentById(R.id.RegisterFragment);

        this.mainActivityEvents = new MainActivityEvents(this);


       this.loginFragment.setLoginFragmentListener(this.mainActivityEvents);
        this.registerFragment.setRegisterFragmentListener(this.mainActivityEvents);

        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.show(this.getLoginFragment());
        transaction.hide(this.getRegisterFragment());
        transaction.commit();


    }

    public Fragment getLoginFragment() {
        return loginFragment;
    }

    public void setLoginFragment(LoginFragment loginFragment) {
        this.loginFragment = loginFragment;
    }

    public RegisterFragment getRegisterFragment() {
        return registerFragment;
    }

    public void setRegisterFragment(RegisterFragment registerFragment) {
        this.registerFragment = registerFragment;
    }

    public MainActivityEvents getMainActivityEvents() {
        return mainActivityEvents;
    }

    public void setMainActivityEvents(MainActivityEvents mainActivityEvents) {
        this.mainActivityEvents = mainActivityEvents;
    }
}
