package com.example.belajarandroid

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.belajarandroid.databinding.FragmentSecondBinding
import com.example.belajarandroid.databinding.RelativeLayoutExBinding
import java.util.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: RelativeLayoutExBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = RelativeLayoutExBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val c = Calendar.getInstance()
//        val year = c.get(Calendar.YEAR)
//        val month = c.get(Calendar.MONTH)
//        val day = c.get(Calendar.DAY_OF_MONTH)
//        getDatebtn.setOnClickListener{
//            val dialog = DatePickerDialog(this,DatePickerDialog.OnDateSetListener{view, year, month, dayOfMonth ->
//                text.setText(""+dayOfMonth+" "+month+", "+year)
//            },year,month+1,day)
//            dialog.show();
//        }
//        binding.getDataBtn.setOnClickListener {
//            val dialog = DatePickerDialog(view.context,
//                DatePickerDialog.OnDateSetListener{ view, year, month, dayOfMonth ->
//                binding.datechoice.setText(""+dayOfMonth+" "+month+", "+year)
//            },year,month+1,day)
//            dialog.show();
//        }
//        binding.goBackBtn.setOnClickListener {
//            findNavController().navigate(R.id.action_go_back)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}