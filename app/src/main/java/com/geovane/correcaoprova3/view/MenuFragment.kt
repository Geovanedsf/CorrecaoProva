package com.geovane.correcaoprova3.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.geovane.correcaoprova3.R
import kotlinx.android.synthetic.main.fragment_menu.*
import kotlinx.android.synthetic.main.fragment_register.*

class MenuFragment : Fragment(R.layout.fragment_menu) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setButtonClicked()
    }

    fun setButtonClicked() {
        buttonRegisterMenu.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_registerFragment)
        }

        buttonViewList.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_listReceitaFragment)
        }
    }

}