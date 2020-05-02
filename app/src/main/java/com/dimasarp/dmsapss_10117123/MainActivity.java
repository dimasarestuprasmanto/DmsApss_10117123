package com.dimasarp.dmsapss_10117123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

/*
Tanggal Pengerjaan : 3 Mei 2020
Deskripsi Pengerjaan : Membuat Splash Screen

NIM : 10117123
NAMA : Dimas Arestu Prasmanto
KELAS : IF4
 */
public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(MainActivity.this, slide1.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}
