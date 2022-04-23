package com.fikri.latihan_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signup(View view) {
        Intent intent = new Intent(MainActivity.this,RegistrationActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(MainActivity.this,Home.class);
        startActivity(intent);
    }
}

//Nama                  : Ahmad Fikri Maulana
//NIM                   : 10119106
//Kelas                 : IF3
//Tanggal Pengerjaan    : 21/04/2022