package com.example.dadn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btn_forgetpw, btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_forgetpw = (Button) findViewById((R.id.btnforget));
        btn_login = (Button) findViewById((R.id.btnlogin));
        btn_forgetpw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forget = new Intent(LoginActivity.this, ForgetPwActivity.class);
                startActivity(forget);
            }
        });

        btn_login.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainpage = new Intent(LoginActivity.this, MainPageActivity.class);
                startActivity(mainpage);
            }
        }));
    }
}