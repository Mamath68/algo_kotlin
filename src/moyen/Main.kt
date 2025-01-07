package moyen

fun main() {
    val formatter = TimeCalc()
    println(formatter.formatDuration(1))
    println(formatter.formatDuration(12))
    println(formatter.formatDuration(123))
    println(formatter.formatDuration(1234))
    println(formatter.formatDuration(12345))
    println(formatter.formatDuration(123456))
    println(formatter.formatDuration(1234567))
    println(formatter.formatDuration(12345678))
    println(formatter.formatDuration(123456789))
}
