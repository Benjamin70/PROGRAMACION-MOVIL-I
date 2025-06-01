fun List<Int>.divisibleBy(condition: (Int) -> Boolean): List<Int> {
    return this.filter { condition(it) }
}

fun main() {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val divisibleBy3 = numbers.divisibleBy { it % 3 == 0 }
    println(divisibleBy3)
}
