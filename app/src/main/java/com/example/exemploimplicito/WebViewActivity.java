package com.example.exemploimplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.net.URL;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        //recebe a Intent
        Intent intent = getIntent();
        //recupera a URI
        Uri uri = intent.getData();
        WebView wv = (WebView) findViewById(R.id.webview);
       //opcional
        wv.getSettings().setJavaScriptEnabled(true);

        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl(uri.toString());
    }
}
