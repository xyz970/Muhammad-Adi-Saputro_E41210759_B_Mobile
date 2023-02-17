package com.example.belajarlayouting

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.os.Bundle
import android.widget.Button
import com.example.belajarandroid.R

class TableLayout : AppCompatActivity() {
    var status: TextView? = null
    var screenName: EditText? = null
    var password: EditText? = null
    var save: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_table)
        status = findViewById(R.id.status)
        screenName = findViewById(R.id.screenName)
        password = findViewById(R.id.password)
        save = findViewById(R.id.save)
    }
}