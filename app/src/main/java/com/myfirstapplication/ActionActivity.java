package com.myfirstapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AliasActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActionActivity extends AppCompatActivity {

    Button btnAlertDailog,btnCustomDialog,btnCustomToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
        btnAlertDailog=findViewById(R.id.btn_AlertDialog);
        btnCustomDialog=findViewById(R.id.btn_custm_alertdialog);
        btnCustomToast=findViewById(R.id.btn_custom_toast);
        btnCustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater=getLayoutInflater();
                View myview =layoutInflater.inflate(R.layout.raw_toast,null);

                Toast toast=new Toast(ActionActivity.this);
                toast.setView(myview);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        btnCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater=getLayoutInflater();
                View myview = layoutInflater.inflate(R.layout.raw_dialog,null);

                AlertDialog.Builder builder = new AlertDialog.Builder(ActionActivity.this);
                AlertDialog alertDialog=builder.create();
                alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                alertDialog.setView(myview);
                alertDialog.show();
            }
        });
        btnAlertDailog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(ActionActivity.this);
                builder.setIcon(R.drawable.user_ngo);
                builder.setTitle("MyApp");
                builder.setMessage("Are you sure, you want to delete?");
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ActionActivity.this,"yes is clicked",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ActionActivity.this,"No is clicked",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNeutralButton("Finish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                    builder.show();

            }
        });

    }
}