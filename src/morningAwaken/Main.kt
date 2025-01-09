package morningAwaken

fun sortString(text: String): String {
    val result = text.toCharArray()
    result.sort()
    return result.joinToString()
}

fun main() {
    println(sortString("Aa74z8b1"))

}
