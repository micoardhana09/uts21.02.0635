package com.example.praktikum121020635;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    PreferenceHelper preferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        preferenceHelper = PreferenceHelper.getInstance(getApplicationContext());
        TextView txtFirst = findViewById(R.id.textactivity1);
        //TextView textactivity1 = findViewById(R.id.textactivity1);
        //String nama = getIntent().getStringExtra("nama");

        //textactivity1.setText(nama);
        txtFirst.setText(preferenceHelper.getNama());
    }
}