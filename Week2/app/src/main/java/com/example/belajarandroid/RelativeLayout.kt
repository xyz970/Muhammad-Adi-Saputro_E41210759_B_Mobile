package com.example.belajarlayouting

import androidx.appcompat.app.AppCompatActivity
import android.app.DatePickerDialog
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.app.DatePickerDialog.OnDateSetListener
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import com.example.belajarandroid.R
import java.util.*

class RelativeLayout : AppCompatActivity() {
    var picker: DatePickerDialog? = null
    var eText: EditText? = null
    var btnGet: Button? = null
    var tvw: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_relative)
        val getDatebtn = findViewById<Button>(R.id.button1)
        val text = findViewById<TextView>(R.id.editText1)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        getDatebtn.setOnClickListener{
            val dialog = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener{ view, year, month, dayOfMonth ->
                    text.setText(""+dayOfMonth+" - "+(month+1)+" - "+year)
                },year,month+1,day)
            dialog.show();
        }
//        tvw = findViewById<View>(R.id.textView1) as TextView
//        eText = findViewById<View>(R.id.editText1) as EditText
//        eText!!.inputType = InputType.TYPE_NULL
//        eText!!.setOnClickListener {
//            val cldr = Calendar.getInstance()
//            val day = cldr[Calendar.DAY_OF_MONTH]
//            val month = cldr[Calendar.MONTH]
//            val year = cldr[Calendar.YEAR]
//            //date picker dialog
//            picker = DatePickerDialog(this@RelativeLayout,
//                { view, year, monthOfYear, dayOfMonth -> eText!!.setText(dayOfMonth.toString() + "/" + (monthOfYear + 1) + "/" + year) },
//                year,
//                month,
//                day
//            )
//            picker!!.show()
//        }
//        btnGet = findViewById<View>(R.id.button1) as Button
//        btnGet!!.setOnClickListener { tvw!!.text = "Selected Date : " + eText!!.text }
    }
}