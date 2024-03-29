package com.example.fitmate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    private Button mRegBtn;

    private Button mLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mRegBtn=findViewById(R.id.start_reg_btn);
        mLoginBtn=findViewById(R.id.login_btn);

        mRegBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                Intent reg_intent=new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(reg_intent);

            }
        });

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent login_intent=new Intent(StartActivity.this, LoginActivity.class);
                startActivity(login_intent);

            }
        });
    }
}
