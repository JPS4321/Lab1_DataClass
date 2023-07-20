// Esta parte del ejercicio fue hecha en el playground
// Juan Pablo Solis
// 22102
// Programacion Plataformas Mobiles
//
fun PrimeraLetraNoRepetida(s: String): Int {
    val MapaFrecuencia = mutableMapOf<Char, Int>()

    for (char in s) {
        MapaFrecuencia[char] = MapaFrecuencia.getOrDefault(char, 0) + 1
    }

    for (i in s.indices) {
        if (MapaFrecuencia[s[i]] == 1) {
            return i
        }
    }

    return -1
}

fun main() {
    val string = "aaammyddrriidd"
    println(PrimeraLetraNoRepetida(string))
}

