package com.example.praktikum121020635;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    private Button btnActivity, btnFragment;
    private EditText nama;
    PreferenceHelper preferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnActivity = findViewById(R.id.changeactivity);
        btnFragment = findViewById(R.id.changefragment);
        nama = findViewById(R.id.nama);

        btnActivity.setOnClickListener(view -> {
            preferenceHelper.setLogin(true);
            preferenceHelper.setNama(nama.getText().toString());
                Intent homeIntent = new Intent(HomeActivity. this, FirstActivity.class);
                //homeIntent.putExtra("nama", nama.getText().toString());
                    startActivity(homeIntent);
        });

        btnFragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent secondIntent = new Intent(HomeActivity.this, SecondActivity.class);
                startActivity(secondIntent);
            }
        });
    }
}