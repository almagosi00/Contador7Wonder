package com.example.contador7wonders.code

class CartaAzul(val pVictoria : Int) : Carta {
    override val color: CartaColor = CartaColor.Azul
    private val puntosVictoria : Int = pVictoria

    fun getPuntosVictoria() : Int{
        return puntosVictoria
    }



}