package com.geovane.correcaoprova3.resource

import com.geovane.correcaoprova3.model.Receita

class DataSourceList {

    companion object {
        fun castToList(receita: Receita) : List<Receita> {
            return listOf(receita)
        }
    }
}