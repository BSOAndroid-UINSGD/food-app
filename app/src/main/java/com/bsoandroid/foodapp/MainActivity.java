package com.bsoandroid.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ambil nilai inputan
        TextView username = findViewById(R.id.username_text);
        TextView password = findViewById(R.id.password_text);

        //Cek apakah username dan password benar
        if (username.getText() == "test" && password.getText() == "123456") {
            //Jika iya pindah activity
            //Menggunakan Explicit Intent
            Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
            this.finish();
        }  else {
            //Jika tidak tampilkan pesan error
            Toast toast = Toast.makeText(getApplicationContext(), "Username/Password salah", Toast.LENGTH_SHORT);
        }
    }
}