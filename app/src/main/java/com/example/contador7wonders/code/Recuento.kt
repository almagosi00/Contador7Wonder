package com.example.contador7wonders.code

class Recuento {
    var etapas = mutableListOf<EtapaMaravilla>()
    var n_monedas : Int = 0

    fun tesoreria() : Int{
        return n_monedas/3;
    }

}