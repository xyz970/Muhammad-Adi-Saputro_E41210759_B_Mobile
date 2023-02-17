package com.example.belajarlayouting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.belajarandroid.R

class MaterialDesign : AppCompatActivity() {
    var text_button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_materialdesign)
        text_button = findViewById(R.id.text_button)
    }
}