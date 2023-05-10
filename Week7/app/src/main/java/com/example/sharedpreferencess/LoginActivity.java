package com.example.sharedpreferencess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sharedpreferencess.Preferences;

public class LoginActivity extends AppCompatActivity {

    private EditText mViewUser, mViewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mViewUser = findViewById(R.id.et_emailSignin);
        mViewPassword = findViewById(R.id.et_passwordSignin);
        mViewPassword.setOnEditorActionListener((v, actionId, event)-> {
            if(actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL){
                razia();
                return true;
            }
            return false;
        });
        findViewById(R.id.button_signinSignin).setOnClickListener((v) -> {
            razia();
        });
        findViewById(R.id.button_signupSignin).setOnClickListener((v) -> {
            startActivity(new Intent(getBaseContext(), RegisterActivity.class));
        });
}
    @Override
    protected void onStart(){
        super.onStart();
        if(Preferences.getLoggedInStatus(getBaseContext())){
            startActivity(new Intent(getBaseContext(), MainActivity.class));
            finish();
        }
    }
    private void razia(){
        mViewUser.setError(null);
        mViewPassword.setError(null);
        View fokus = null;
        boolean cancel =false;
        String user = mViewUser.getText().toString();
        String password = mViewPassword.getText().toString();
        if(TextUtils.isEmpty(user)){
            mViewUser.setError("This Field is required");
            fokus = mViewUser;
            cancel = true;
        }else if(!cekUser(user)){
            mViewUser.setError("This Username Not Found");
            fokus = mViewUser;
            cancel = true;
        }
        if(TextUtils.isEmpty(password)){
            mViewPassword.setError("This Field is Required");
            fokus = mViewPassword;
            cancel = true;
        }else if(!cekPassword(password)){
            mViewPassword.setError("This Password Incorrect");
            fokus = mViewPassword;
            cancel = true;
        }
        if(cancel) fokus.requestFocus();
        else masuk();
    }

    private void masuk(){
        Preferences.setLoggedInUser(getBaseContext(), mViewUser.getText().toString());
        Preferences.setLoggedInStatus(getBaseContext(), true);
        startActivity(new Intent(getBaseContext(), MainActivity.class));
        finish();
    }
    private Boolean cekUser(String user){
        SharedPreferences sp = getSharedPreferences("daftar", Context.MODE_PRIVATE);
        if(sp.getString("username", "").equals(user)){
            return true;
        }
        return false;
    }
    private Boolean cekPassword(String password){
        SharedPreferences sp = getSharedPreferences("daftar", Context.MODE_PRIVATE);
        if(sp.getString("pass", "").equals(password)){
            return true;
        }
        return false;
    }


}
