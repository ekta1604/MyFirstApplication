package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView tv_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        tv_data = findViewById(R.id.tv_data);

        Intent i=getIntent();
        String strUsername = i.getStringExtra("KEY_USERNAME");
        tv_data.setText(strUsername);


    }
}