package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SeekRatingActivity extends AppCompatActivity {
    TextView tvDataOfSeek,tvDataOfRating;
    String x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_rating);
        tvDataOfRating=findViewById(R.id.tv_dataofrating);
        tvDataOfSeek=findViewById(R.id.tv_dataofseek);

        Intent i=getIntent();
        String strSeekValue=i.getStringExtra("seek");
        String strRatingValue=i.getStringExtra("rate");
        tvDataOfSeek.setText(strSeekValue);
        tvDataOfRating.setText(strRatingValue);

    }
}