package facile

class ExtractItem(private var text: String = "", private var value: Int = 0, private var valueLength: Int = 0) {

    init {
        val index = text.indexOfFirst { it.isDigit() }
        if (index != -1) {
            this.value = text.substring(index).toInt()
            this.valueLength = text.substring(index).length
            this.text = text.substring(0, index)
        }
    }

    private fun incrementString(): String {
        val incrementedValue = (value + 1).toString().padStart(valueLength, '0')
        return "$text$incrementedValue"
    }

    fun processInput() {
        print("Entrez une donnée: ")
        val inputString = readlnOrNull()
        if (inputString != null) {
            val index = inputString.indexOfFirst { it.isDigit() }
            if (index == -1) {
                println("${inputString}1")
            } else {
                this.text = inputString.substring(0, index)
                this.value = inputString.substring(index).toInt()
                this.valueLength = inputString.substring(index).length
                println("$inputString => ${incrementString()}")
            }
        }
    }
}
