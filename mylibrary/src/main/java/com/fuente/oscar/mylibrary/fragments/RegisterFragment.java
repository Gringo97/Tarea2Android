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
public class RegisterFragment extends Fragment {
    private Button btnVolver,btnRegistrar;
    public EditText txtEmail,txtPass;
    public RegisterFragmentEvents registerFragmentEvents;
    public RegisterFragmentListener registerFragmentListener;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewRegisterFragment = inflater.inflate(R.layout.fragment_register, container, false);
        this.btnRegistrar = (Button) viewRegisterFragment.findViewById(R.id.btnAceptarRegistrar);
        this.btnVolver = (Button) viewRegisterFragment.findViewById(R.id.btnCancelarRegistrar);
        this.txtEmail = (EditText) viewRegisterFragment.findViewById(R.id.txtEmail);
        this.txtPass = (EditText) viewRegisterFragment.findViewById(R.id.txtPass);
        this.btnRegistrar.setText(R.string.Register);
        this.btnVolver.setText(R.string.Back);

        registerFragmentEvents = new RegisterFragmentEvents(this);
        this.btnRegistrar.setOnClickListener(registerFragmentEvents);
        this.btnVolver.setOnClickListener(registerFragmentEvents);

        return viewRegisterFragment;
    }

    public void setRegisterFragmentListener(RegisterFragmentListener registerFragmentListener) {
        this.registerFragmentListener = registerFragmentListener;
    }
}
