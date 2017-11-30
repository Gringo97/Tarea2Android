package com.fuente.oscar.mylibrary.fragments;

import android.view.View;

import com.fuente.oscar.mylibrary.R;

/**
 * Created by oscar.fuente on 23/11/2017.
 */

public class RegisterFragmentEvents implements View.OnClickListener {
    private RegisterFragment registerFragment;


    public RegisterFragmentEvents(RegisterFragment registerFragment){this.registerFragment = registerFragment;}



    @Override
    public void onClick(View v) {

           if (v.getId() == R.id.btnAceptarRegistrar) {
               if (this.registerFragment.registerFragmentListener !=null) {
                   this.registerFragment.registerFragmentListener.onClickRegister();
               }
           } else if (v.getId() == R.id.btnCancelarRegistrar) {
               if (this.registerFragment.registerFragmentListener !=null) {
                   this.registerFragment.registerFragmentListener.onClickVolver();
               }
           }


    }


}
