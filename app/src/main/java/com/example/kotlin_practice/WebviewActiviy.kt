package com.example.kotlin_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class WebviewActiviy : AppCompatActivity() {

    private lateinit var webview: WebView
    private val URL = "https://www.google.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        webview = findViewById(R.id.webview)
        webview.apply {
            loadUrl(URL)
            webViewClient=WebViewClient()
            settings.javaScriptEnabled=true

        }


    }

    override fun onBackPressed() {
        if(webview.canGoBack()) {
            webview.goBack()
        }else {
            super.onBackPressed()
        }
    }
}