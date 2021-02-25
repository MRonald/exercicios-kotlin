fun menu() {
    println("-----------------")
    println("[1] Somar")
    println("[2] Subtrair")
    println("[3] Multiplicar")
    println("[4] Dividir")
    println("-----------------")
    print("Sua opção: ")
}

fun main() {
    print("Digite o primeiro número: ")
    val n1 = readLine()!!.toFloat()
    print("Digite o segundo número: ")
    val n2 = readLine()!!.toFloat()
    menu()
    val op = readLine()!!.toInt()
    println()
    when (op) {
        1 -> println("${n1} + ${n2} = ${n1 + n2}")
        2 -> println("${n1} - ${n2} = ${n1 - n2}")
        3 -> println("${n1} * ${n2} = ${n1 * n2}")
        4 -> println("${n1} / ${n2} = ${n1 / n2}")
        else -> println("OPÇÃO INVÁLIDA! Tente novamente.")
    }
}