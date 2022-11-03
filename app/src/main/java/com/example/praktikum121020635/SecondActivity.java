package com.example.praktikum121020635;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

import android.os.Bundle;
import android.window.SplashScreen;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        int splashinterval = 10;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SecondActivity.this, FirstActivity.class));
            }
        }, splashinterval);

    }
}


