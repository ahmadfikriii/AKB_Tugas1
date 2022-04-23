package com.fikri.latihan_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void profile(View view) {
        Intent intent = new Intent(Home.this,ProfileActivity.class);
        startActivity(intent);
    }

    public void logout(View view) {
        Intent intent = new Intent(Home.this,MainActivity.class);
        startActivity(intent);
    }
}

//Nama                  : Ahmad Fikri Maulana
//NIM                   : 10119106
//Kelas                 : IF3
//Tanggal Pengerjaan    : 22/04/2022