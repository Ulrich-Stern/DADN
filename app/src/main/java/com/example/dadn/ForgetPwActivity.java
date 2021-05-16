package com.example.dadn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgetPwActivity extends AppCompatActivity {

    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pw);

        btn_back = (Button) findViewById((R.id.btnback));
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back_login = new Intent(ForgetPwActivity.this, LoginActivity.class);
                startActivity(back_login);
            }
        });
    }
}