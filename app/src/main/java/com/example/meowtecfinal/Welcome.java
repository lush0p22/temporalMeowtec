package com.example.meowtecfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i = new Intent(Welcome.this,MainActivity.class);
                startActivity(i);
                finish();
            }

        },3000);
    }
}
