package com.example.belajarlayouting

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.os.Bundle
import android.widget.Button
import com.example.belajarandroid.R

class LinearLayout : AppCompatActivity() {
    var to: EditText? = null
    var subject: EditText? = null
    var message: EditText? = null
    var send: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_linear)
        to = findViewById(R.id.to)
        subject = findViewById(R.id.subject)
        message = findViewById(R.id.message)
        send = findViewById(R.id.send)
    }
}