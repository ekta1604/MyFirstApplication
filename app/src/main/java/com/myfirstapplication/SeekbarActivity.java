package com.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekbarActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView tvSeekbar,tvRetingbar;
    RatingBar ratingBar;
    String x,y;
    Button btnSeekRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        seekBar = findViewById(R.id.seekbar);
        tvSeekbar=findViewById(R.id.tv_seekbar);
        ratingBar=findViewById(R.id.ratingbar);
        tvRetingbar=findViewById(R.id.tv_ratingbar);
        btnSeekRating=findViewById(R.id.btn_seekrating);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//                tvRetingbar.setText(String.valueOf(rating));
                y=String.valueOf(rating);
                tvRetingbar.setText(y);
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                tvSeekbar.setText(String.valueOf(progress));
                x=String.valueOf(progress);
                tvSeekbar.setText(x);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        btnSeekRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SeekbarActivity.this,SeekRatingActivity.class);
                i.putExtra("seek",x);
                i.putExtra("rate",y);
                startActivity(i);

            }
        });


    }
}