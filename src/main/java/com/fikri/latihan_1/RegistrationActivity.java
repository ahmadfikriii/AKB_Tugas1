package com.fikri.latihan_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void register(View view) {
        Intent intent = new Intent(RegistrationActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void cancel(View view) {
        Intent intent = new Intent(RegistrationActivity.this,MainActivity.class);
        startActivity(intent);
    }
}

//Nama                  : Ahmad Fikri Maulana
//NIM                   : 10119106
//Kelas                 : IF3
//Tanggal Pengerjaan    : 22/04/2022