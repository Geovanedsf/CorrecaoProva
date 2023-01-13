package com.geovane.correcaoprova3.resource

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.geovane.correcaoprova3.R
import com.geovane.correcaoprova3.model.Receita
import kotlinx.android.synthetic.main.res_item_list.view.*

class ListReceitaAdapter(private val onClicked: (Receita) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var items: List<Receita>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ListReceitaViewHolder (
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ListReceitaViewHolder ->
                holder.bind(items[position], onClicked)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun setDataSet(list: List<Receita>) {
        this.items = list
    }

    class ListReceitaViewHolder
    constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        var titlereceita: TextView = itemView.textViewTitleList
        var ingredientesReceita : TextView = itemView.textViewIngredientesList
        var modoPreparoReceita: TextView = itemView.textViewModoPreparoList


        fun bind(receita: Receita, onClicked: (Receita) -> Unit) {
            titlereceita.text = receita.title
            ingredientesReceita.text = receita.ingredients
            modoPreparoReceita.text = receita.preparation

            itemView.setOnClickListener {
                onClicked(receita)
            }
        }
    }
}