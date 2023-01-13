package com.geovane.correcaoprova3.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.geovane.correcaoprova3.R
import com.geovane.correcaoprova3.resource.DataSourceList
import com.geovane.correcaoprova3.resource.ListReceitaAdapter
import kotlinx.android.synthetic.main.fragment_list_receita.*
import kotlinx.android.synthetic.main.fragment_menu.*

class ListReceitaFragment : Fragment(R.layout.fragment_list_receita) {

    val args: ListReceitaFragmentArgs by navArgs()

    private lateinit var listAdapter: ListReceitaAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView()
        setButtonClicked()
    }

    fun setRecyclerView(){
        listAdapter = ListReceitaAdapter{
            var action = ListReceitaFragmentDirections.actionListReceitaFragmentToDatailsReceitaFragment()
        }

        args.receita?.let {
            DataSourceList.castToList(it)
        }?.let{
            listAdapter.setDataSet(it)
        }

        recyclerView.apply {
            adapter = listAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    fun setButtonClicked() {
            // do NOTHING
    }
}