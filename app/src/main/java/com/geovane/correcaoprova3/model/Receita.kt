package com.geovane.correcaoprova3.model

import java.io.Serializable

data class Receita(
    var title: String,
    var ingredients: String,
    var preparation: String
): Serializable
