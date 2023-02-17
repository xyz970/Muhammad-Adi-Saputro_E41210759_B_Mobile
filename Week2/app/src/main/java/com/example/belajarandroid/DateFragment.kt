package com.example.belajarandroid

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.belajarandroid.databinding.FragmentFirstBinding
import com.example.belajarandroid.databinding.FragmentSecondBinding
import com.example.belajarandroid.databinding.RelativeLayoutExBinding
import java.util.*

//class DateFragment(contentLayoutId: Int) : AppCompatActivity(contentLayoutId) {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.relative_layout_ex)
//        val getDatebtn = findViewById<Button>(R.id.getDataBtn)
//        val text = findViewById<TextView>(R.id.datechoice)
//        val c = Calendar.getInstance()
//        val year = c.get(Calendar.YEAR)
//        val month = c.get(Calendar.MONTH)
//        val day = c.get(Calendar.DAY_OF_MONTH)
//        getDatebtn.setOnClickListener{
//            val dialog = DatePickerDialog(this,
//                DatePickerDialog.OnDateSetListener{ view, year, month, dayOfMonth ->
//                text.setText(""+dayOfMonth+" "+month+", "+year)
//            },year,month+1,day)
//            dialog.show();
//        }
//    }
//}
class DateFragment : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}