package com.example.websitemobileversion;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

   private WebView webViewId;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webViewId = (WebView) findViewById(R.id.displayViewId);

        WebSettings webSettings = webViewId.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webViewId.setWebViewClient(new WebViewClient());
        webViewId.loadUrl("http://www.cu.ac.bd/");

    }

    @Override// eif function web page er pichone aste help kore
    public void onBackPressed() {
        if(webViewId.canGoBack()){
           webViewId.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
