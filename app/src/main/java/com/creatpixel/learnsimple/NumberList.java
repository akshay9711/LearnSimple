package com.creatpixel.learnsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NumberList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_list);

        WebView webView = findViewById(R.id.numbersListWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://blogs.transparent.com/japanese/japanese-numbers-1-to-100/");
    }
}
