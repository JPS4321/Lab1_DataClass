enum class Team {
    Mercedes,
    RedBullRacing,
    Ferrari,
    McLaren,
    AstonMartin,
    Alpine,
    AlphaTauri,
    AlfaRomeo,
    Haas,
    Williams
}
    private fun printTeamDetails(team: Team) {
        //Task 1
        println("Team: $team")

        //Task 2
        val Mensaje = when (team) {
            Team.Mercedes -> "El piloto de mercedes es Lewis Hamilton"
            Team.RedBullRacing -> "Redbull tiene una forma de ser agresivos en la pista."
            Team.Ferrari -> "Ferrari no es el equipo que era antes"
            Team.McLaren -> "McLaren ha tenido a uno de los pilotos mas reconocidos de la historia, Ayrton Senna"
            Team.AstonMartin -> "Aston Martin regreso a la formula en el 2021."
            Team.Alpine -> "Alpine es el nuevo nombre del equipo de renault."
            Team.AlphaTauri -> "AlphaTauri es el hermano de equipo de redbull."
            Team.AlfaRomeo -> "Alfa Romeo tiene muchos carros iconicos."
            Team.Haas -> "Haas is nunca ha ganado nada XD."
            Team.Williams -> "Williams es uno de los equipos mas veteranos."
        }
        println("Message: $Mensaje")
    }

fun main() {
    printTeamDetails(Team.Mercedes)
}