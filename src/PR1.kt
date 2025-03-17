fun main() {
    println("Введите четырехзначное число:")
    val input = readLine()
    if (input != null && input.all { it.isDigit() }) {
        val number = input.toInt()
        val result = roundNumber(number)
        println("Получаем: $result")
    }
}
fun roundNumber(n: Int): String {
    return when {
        n < 1000 -> n.toString()
        n in 1000..9999 -> "${n / 1000}К"
        else -> ""
    }
}
