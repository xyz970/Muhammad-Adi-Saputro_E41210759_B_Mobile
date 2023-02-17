package com.example.belajarandroid

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.belajarandroid.databinding.ActivityMainBinding
import com.example.belajarlayouting.*
import com.example.belajarlayouting.FrameLayout
import com.example.belajarlayouting.LinearLayout
import com.example.belajarlayouting.RelativeLayout
import com.example.belajarlayouting.TableLayout
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn1).setOnClickListener {
            val intent = Intent(this@MainActivity, LinearLayout::class.java)
            startActivity(intent)
        }
//        val getDatebtn = findViewById<Button>(R.id.getDataBtn)
//        val text = findViewById<TextView>(R.id.datechoice)
//        val c = Calendar.getInstance()
//        val year = c.get(Calendar.YEAR)
//        val month = c.get(Calendar.MONTH)+1
//        val day = c.get(Calendar.DAY_OF_WEEK)
//        getDatebtn.setOnClickListener{
//            val dialog = DatePickerDialog(this,DatePickerDialog.OnDateSetListener{view, year, month, dayOfMonth ->
//                text.setText(""+dayOfMonth+" - "+(month+1)+" - "+year)
//            },year,month+1,day)
//            dialog.show();
//        }
    }

fun linear(view: View?) {
    val intent = Intent(this@MainActivity, LinearLayout::class.java)
    startActivity(intent)
}

    fun Relative(view: View?) {
        val intent = Intent(this@MainActivity, RelativeLayout::class.java)
        startActivity(intent)
    }

    fun Constraint(view: View?) {
        val intent = Intent(this@MainActivity, ConstraintLayout::class.java)
        startActivity(intent)
    }

    fun Frame(view: View?) {
        val intent = Intent(this@MainActivity, FrameLayout::class.java)
        startActivity(intent)
    }

    fun Table(view: View?) {
        val intent = Intent(this@MainActivity, TableLayout::class.java)
        startActivity(intent)
    }

    fun Material(view: View?) {
        val intent = Intent(this@MainActivity, MaterialDesign::class.java)
        startActivity(intent)
    }

    fun ScrollV(view: View?) {
        val intent = Intent(this@MainActivity, ScrollViewLayout::class.java)
        startActivity(intent)
    }

    fun ScrollVH(view: View?) {
        val intent = Intent(this@MainActivity, HorizontalScrollViewLayout::class.java)
        startActivity(intent)
    }
}