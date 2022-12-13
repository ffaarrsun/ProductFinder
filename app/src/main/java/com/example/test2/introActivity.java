package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.logging.Handler;

public class introActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){

            }
        },delayMillis:2000);
    }
}