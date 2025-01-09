package listsort

fun main() {
    val list = intArrayOf(3, 5, -1, 8, 2, 7, 6)
    val (validLists, trashList) = findConsecutiveSums(list, 8)
    println("Liste valide: $validLists")
    println("Liste Poubelle: $trashList")
}

fun findConsecutiveSums(list: IntArray, target: Int): Pair<List<List<Int>>, List<Int>> {
    val validLists = mutableListOf<List<Int>>()
    val trashList = mutableListOf<Int>()
    var i = 0

    while (i < list.size) {
        var sum = 0
        val tempList = mutableListOf<Int>()
        var j = i

        while (j < list.size && sum < target) {
            sum += list[j]
            tempList.add(list[j])
            j++
        }

        if (sum == target) {
            validLists.add(tempList)
            i = j // Move to the next element after the valid sublist
        } else {
            trashList.add(list[i])
            i++
        }
    }

    return Pair(validLists, trashList)
}
