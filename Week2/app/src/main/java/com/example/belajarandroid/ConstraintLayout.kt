package com.example.belajarlayouting

import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import android.os.Bundle
import android.widget.ImageView
import com.example.belajarandroid.R

class ConstraintLayout : AppCompatActivity() {
    var cardView: CardView? = null
    var cardViews2: CardView? = null
    var textView: TextView? = null
    var imageView: ImageView? = null
    var textInputLayout2: TextInputLayout? = null
    var textInputLayout3: TextInputLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_constraint)
        cardView = findViewById(R.id.cardView)
        cardViews2 = findViewById(R.id.cardViews2)
        textView = findViewById(R.id.textView)
        imageView = findViewById(R.id.imageView)
        textInputLayout2 = findViewById(R.id.textInputLayout2)
        textInputLayout3 = findViewById(R.id.textInputLayout3)
    }
}