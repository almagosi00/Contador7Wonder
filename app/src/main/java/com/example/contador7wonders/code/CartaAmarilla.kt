package com.example.contador7wonders.code

class CartaAmarilla(val pVictoria : Int)  : Carta {
    override val color: CartaColor = CartaColor.Amarilla
    private val puntosVictoria : Int = pVictoria

    fun getPuntosVictoria() : Int{
        return puntosVictoria
    }
}