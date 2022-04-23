package com.fikri.latihan_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void kembali(View view) {
        Intent intent = new Intent(ProfileActivity.this,Home.class);
        startActivity(intent);
    }
}

//Nama                  : Ahmad Fikri Maulana
//NIM                   : 10119106
//Kelas                 : IF3
//Tanggal Pengerjaan    : 23/04/2022