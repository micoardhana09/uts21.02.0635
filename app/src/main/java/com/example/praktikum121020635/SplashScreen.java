package com.example.praktikum121020635;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
        public static final String TAG= "SplashScreen";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.splash_activity);
                int splashinterval = 1000;
                new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                                Intent intent = new Intent(SplashScreen.this, HomeActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(intent);
                        }
                }, splashinterval);

        }

        @Override
        protected void onStart() {
                super.onStart();
                Log.d(TAG, "onStart: ");
        }

        @Override
        protected void onStop() {
                super.onStop();
                Log.d(TAG, "onStop: ");
        }

        @Override
        protected void onDestroy() {
                super.onDestroy();
                Log.d(TAG, "onDestroy: ");
        }

        @Override
        protected void onPause() {
                super.onPause();
                Log.d(TAG, "onPause: ");
        }

        @Override
        protected void onResume() {
                super.onResume();
                Log.d(TAG, "onResume: ");
        }

        @Override
        protected void onRestart() {
                super.onRestart();
                Log.d(TAG, "onRestart: ");

        }
}

