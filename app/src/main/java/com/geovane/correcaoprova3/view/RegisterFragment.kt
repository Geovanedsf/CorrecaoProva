package com.geovane.correcaoprova3.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geovane.correcaoprova3.R
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : Fragment(R.layout.fragment_register) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setButtonClicked()
    }

    fun setButtonClicked(){
        buttonRegisterReceita.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_menuFragment)
        }
    }
}