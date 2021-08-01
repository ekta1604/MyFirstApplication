package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText edtUserName;
    Button btnLogin;
    ImageView imglogo;
    Button btnNext;
    Button btnRatings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUserName = findViewById(R.id.edt_username);
        btnLogin=findViewById(R.id.btn_login);
        imglogo=findViewById(R.id.img_logo);
        btnNext = findViewById(R.id.btn_next);
        btnRatings=findViewById(R.id.btn_rtn);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(i);
            }
        });
        btnRatings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW);
                startActivity(i);
            }
        });
        
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imglogo.setImageResource(R.drawable.zoom);
                String strUsername = edtUserName.getText().toString();
                if(strUsername.equals("")){
                    Toast.makeText(MainActivity.this, "Enter Username", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Username "+strUsername, Toast.LENGTH_SHORT).show();
                }
                //Explicite Intent
                Intent i = new Intent(MainActivity.this,HomeActivity.class);
                i.putExtra("KEY_USERNAME",strUsername);
                startActivity(i);





            }

        });
    }
}