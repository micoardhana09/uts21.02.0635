package com.example.praktikum121020635;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public class PreferenceHelper {
    private static PreferenceHelper INSTANCE;
    private SharedPreferences sharedPreferences;

    private PreferenceHelper(Context context){
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences("name.example.myaplication", Context.MODE_PRIVATE);
    }

    public static PreferenceHelper getInstance(Context context){
        if (INSTANCE == null){
            INSTANCE = new PreferenceHelper(context);
        }
        return INSTANCE;
    }

    public SharedPreferences preferences(){ return sharedPreferences; }

    public void setLogin(boolean islogin){
        sharedPreferences.edit().putBoolean("isLogin", islogin).apply();
    }

    public boolean isLogin(){ return sharedPreferences.getBoolean("isLogin", false);}
    public void setNama (String nama){sharedPreferences.edit().putString("nama",nama).apply();}
    public String getNama(){ return sharedPreferences.getString("nama", "pak Doe");}
}