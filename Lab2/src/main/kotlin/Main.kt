//Juan Pablo Solis
//22102
//Laboratorio 2
import kotlin.random.Random


data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)


fun calcularPromedio(numeros: List<Int>): Double {
    val suma = numeros.reduce { acumulador, numero -> acumulador + numero }
    return suma.toDouble() / numeros.size
}
fun isPalindrome(cadena: String) = cadena == cadena.reversed()


fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
fun Persona_Estudiante(person: Person): Student {
    val studentId = Random.nextInt(10000, 99999).toString()  // Genera un ID de estudiante aleatorio
    return Student(person.name, person.age, person.gender, studentId)
}
fun Detalles(student: Student) {
    println("El Estudiante ${student.name} tiene ${student.age} años y su ID es ${student.studentId}")
}

fun main() {
    //Inciso 1
    val numbers = mutableListOf<Int>(1, 2, 3, 4, 5)
    val promedio = calcularPromedio(numbers)
    println(promedio)
    //Inciso 2
    val impares = numbers.filter { it % 2 != 0 }
    println(impares)
    //Inciso 3
    val Palabra = "radar"
    val Palindromo = isPalindrome(Palabra)
    println(Palindromo)
    //Inciso 4
    val nombres = listOf("Alicia", "Jorge", "Luis", "Ana")
    val saludos = nombres.map { nombre -> "¡Hola, $nombre!" }
    println(saludos)
    //inciso 5
    val ResultadoSuma = performOperation(5, 3) { num1, num2 -> num1 + num2 }
    println(ResultadoSuma)
    //Inciso 6
    val persons = listOf(
        Person("Juan", 20, "Hombre"),
        Person("Ana", 19, "Mujer"),
        Person("Luis", 21, "Hombre")
    )
    val students = persons.map(::Persona_Estudiante)
    students.forEach(::Detalles)




}