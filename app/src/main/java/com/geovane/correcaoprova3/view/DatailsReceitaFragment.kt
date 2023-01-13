package com.geovane.correcaoprova3.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geovane.correcaoprova3.R
import kotlinx.android.synthetic.main.fragment_menu.*

class DatailsReceitaFragment : Fragment(R.layout.fragment_datails_receita) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    fun setButtonClicked() {
        buttonRegisterMenu.setOnClickListener {
//            findNavController().navigate(R.id.)
        }
    }
}