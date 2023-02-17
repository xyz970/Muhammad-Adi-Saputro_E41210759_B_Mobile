package com.example.belajarlayouting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.belajarandroid.R

class FrameLayout : AppCompatActivity() {
    var imageView: ImageView? = null
    var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitvity_layout_frame)
        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.btn1)
    }
}