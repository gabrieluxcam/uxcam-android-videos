package com.uxcam.videos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.uxcam.UXCam;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(this);
        setContentView(myWebView);
//        setContentView(R.layout.activity_web_view);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

//        UXCam.attachWebviewInterface(myWebView);  This will be after I add class class="uxcam-occlude" to code in html
        myWebView.loadUrl("https://gabmadera.com/");
    }
}