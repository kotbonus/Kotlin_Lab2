import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Введите количество лет: ")
    val years = scanner.nextInt()
    val result = getYearEnding(years)
    println(result)
}
fun getYearEnding(years: Int): String {
    val remainder10 = years % 10
    val remainder100 = years % 100
    return when {
        remainder100 in 11..14 -> "$years лет"
        remainder10 == 1 -> "$years год"
        remainder10 in 2..4 -> "$years года"
        else -> "$years лет"
    }
}
