package com.example.apppokedex.domain

data class Pokemon (
    val imageUrl : String,
    val number : Int,
    val name : String,
    val type : List<PokemonType>
)