package com.example.madpractical6_20012021051
Practical: 6
20012021051_Raval Nirnay A Page 5
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
class youtube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val youtubeid=""
        val mywebview=findViewById<WebView>(R.id.wv)
        val settings=mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeid")
    }
}