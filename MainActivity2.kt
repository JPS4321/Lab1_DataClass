fun sunsetViews(Edificio: IntArray, Direccion: String): List<Int> {
    val indices = mutableListOf<Int>()
    var AlturaMax = 0

    when (Direccion) {
        "WEST" -> {
            for (i in Edificio.indices) {
                if (Edificio[i] > AlturaMax) {
                    indices.add(i)
                    AlturaMax = Edificio[i]
                }
            }
        }
        "EAST" -> {
            for (i in Edificio.indices.reversed()) {
                if (Edificio[i] > AlturaMax) {
                    indices.add(i)
                    AlturaMax = Edificio[i]
                }
            }
        }
    }

    indices.sort()
    return indices
}

fun main() {
    val edificio = intArrayOf(3, 5, 4, 4, 3, 1, 3, 2)
    val direccion = "EAST"

    println(sunsetViews(edificio, direccion))
}
