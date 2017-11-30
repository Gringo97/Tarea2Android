package com.fuente.oscar.tarea2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fuente.oscar.mylibrary.fragments.InicioFragment;
import com.fuente.oscar.mylibrary.fragments.LoginFragment;
import com.fuente.oscar.mylibrary.fragments.RegisterFragment;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    public LoginFragment loginFragment;
    public RegisterFragment registerFragment;
    public InicioFragment inicioFragment;
    private MainActivityEvents mainActivityEvents;
    FireBaseAdmin fireBaseAdmin;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.loginFragment = (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.LoginFragment);
        this.registerFragment = (RegisterFragment) getSupportFragmentManager().findFragmentById(R.id.RegisterFragment);
         this.inicioFragment = (InicioFragment) getSupportFragmentManager().findFragmentById(R.id.InicioFragment );
        this.mainActivityEvents = new MainActivityEvents(this);


       this.loginFragment.setLoginFragmentListener(this.mainActivityEvents);
        this.registerFragment.setRegisterFragmentListener(this.mainActivityEvents);


        fireBaseAdmin=new FireBaseAdmin(this);
        fireBaseAdmin.setListener(mainActivityEvents);


        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.show(this.loginFragment);
        transaction.hide(this.registerFragment);
        transaction.hide(this.inicioFragment);
        transaction.commit();


    }


    public MainActivityEvents getMainActivityEvents() {
        return mainActivityEvents;
    }

    public void setMainActivityEvents(MainActivityEvents mainActivityEvents) {
        this.mainActivityEvents = mainActivityEvents;
    }
}
