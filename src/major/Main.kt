package major

fun main() {
    val vm = VersionManager("1.2.3")
    println(vm.release())
    vm.major().minor().patch()
    println(vm.release())
    vm.minor().patch()
    println(vm.release())
    vm.patch()
    println(vm.release())
    vm.rollback()
    println(vm.release())
}
