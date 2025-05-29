fun main() {
    println("========== Parte 1 ==========")
    mainParte1()

    println("\n========== Parte 2 ==========")
    mainParte2()
}
fun mainParte1() {
    // Lambda simple para tirar un dado de 12 lados
    val rollDice = { (1..12).random() }

    println("Lanzamiento de dado (1..12): ${rollDice()}")

    // Lambda extendida que acepta cantidad de lados y devuelve 0 si es 0
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }

    println("Dado con 6 lados: ${rollDice2(6)}")
    println("Dado con 0 lados: ${rollDice2(0)}")
}
fun mainParte2() {
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }

    gamePlay(rollDice2)
}
fun gamePlay(diceRoll: (Int) -> Int) {
    val result = diceRoll(6)
    println("Resultado del juego: $result")
}