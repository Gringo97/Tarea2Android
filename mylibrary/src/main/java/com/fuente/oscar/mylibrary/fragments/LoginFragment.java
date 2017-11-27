package com.fuente.oscar.mylibrary.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.fuente.oscar.mylibrary.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private Button btnLogin,btnRegister;
    private EditText txtUser,txtPass;
    private  LoginFragmentEvents loginFragmentEvents;
    private LoginFragmentListener loginFragmentListener;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewLoginFragment = inflater.inflate(R.layout.fragment_login, container, false);
        this.btnLogin = (Button) viewLoginFragment.findViewById(R.id.btnLogin);
        this.btnRegister = (Button) viewLoginFragment.findViewById(R.id.btnRegister);
        this.txtUser = (EditText) viewLoginFragment.findViewById(R.id.txtEmail);
        this.txtPass = (EditText) viewLoginFragment.findViewById(R.id.txtPass);
        btnLogin.setText(R.string.Login);
        btnRegister.setText(R.string.Register);

        loginFragmentEvents = new LoginFragmentEvents(this);
        this.btnLogin.setOnClickListener(loginFragmentEvents);
        this.btnRegister.setOnClickListener(loginFragmentEvents);
        return viewLoginFragment;
    }

    public Button getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(Button btnLogin) {
        this.btnLogin = btnLogin;
    }

    public Button getBtnRegister() {
        return btnRegister;
    }

    public void setBtnRegister(Button btnRegister) {
        this.btnRegister = btnRegister;
    }

    public EditText getTxtUser() {
        return txtUser;
    }

    public void setTxtUser(EditText txtUser) {
        this.txtUser = txtUser;
    }

    public EditText getTxtPass() {
        return txtPass;
    }

    public void setTxtPass(EditText txtPass) {
        this.txtPass = txtPass;
    }

    public LoginFragmentEvents getLoginFragmentEvents() {
        return loginFragmentEvents;
    }

    public void setLoginFragmentEvents(LoginFragmentEvents loginFragmentEvents) {
        this.loginFragmentEvents = loginFragmentEvents;
    }

    public LoginFragmentListener getLoginFragmentListener() {
        return loginFragmentListener;
    }

    public void setLoginFragmentListener(LoginFragmentListener loginFragmentListener) {
        this.loginFragmentListener = loginFragmentListener;
    }
}
