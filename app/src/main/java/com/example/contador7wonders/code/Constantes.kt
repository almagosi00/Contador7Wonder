package com.example.contador7wonders.code

enum class DireccionAccion {
    Izquierda, Propio, Derecha
}

enum class CartaColor {
    Azul, Amarilla, Verde, Morada
}

enum class MarcadoresMilitares(val marcador: Int) {
    Derrota(-1), VictoriaEtapa1(1), VictoriaEtapa2(3), VictoriaEtapa3(5)
}