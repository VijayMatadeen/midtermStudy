package com.midterm1.mandeepmidterm2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onReturnClick(View view) {
        //Using intent to relaunch my main activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void onLoginClick(View view){
        //Do something
    }
}