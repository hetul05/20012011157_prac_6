package com.example.madpractical6_20012021051
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController= MediaController(this)
        val uri:Uri=Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        val myvideoview=findViewById<VideoView>(R.id.vv)
        myvideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myvideoview)
        myvideoview.setVideoURI(uri)
        myvideoview.requestFocus()
        myvideoview.start()
        val button=findViewById<FloatingActionButton>(R.id.vb)
        button.setOnClickListener {
            val intent = Intent(this, youtube::class.java)
            startActivity(intent)
        }
    }
}