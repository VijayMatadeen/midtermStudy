package com.midterm1.mandeep;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

public class DisplayActivity extends AppCompatActivity {
    //Mandeep Singh N01230342
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        WebView myView = (WebView) findViewById(R.id.webView);
        myView.loadUrl("http://javapoint.com");
    }
}