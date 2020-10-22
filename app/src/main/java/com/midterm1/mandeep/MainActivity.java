package com.midterm1.mandeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//Mandeep Singh N01230342
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callIntent(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.buttonBrowser:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.cbc.ca"));
                startActivity(intent);
                break;
            case R.id.buttonCall:
                intent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:(416)289-5000"));
                startActivity(intent);
                break;
            case R.id.buttonActivity:
                intent = new Intent(this, DisplayActivity.class);
                startActivity(intent);
            default:
                break;
        }
    }
}