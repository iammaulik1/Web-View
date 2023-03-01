package com.example.a12webview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import java.net.URL

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    private val URL ="https://www.google.com/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView=findViewById(R.id.webView)
        webView.apply { webView
        loadUrl(URL)
        }
    }
}