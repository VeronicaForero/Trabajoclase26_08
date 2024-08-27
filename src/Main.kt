fun main() {
    val personas: MutableList<Persona> = mutableListOf()
    val estudiante1 = Estudiante("nicolas", "Pepito", "47344764", "Soltero", "1º")
    val profesor1= Profesores("paula", "Londoño", "88387375", "Casada", 201, 2002, "Matemáticas")
    val personalServicio1 = Personal_de_servicio("Pedro", "lopez", "8733857387", "Soltero", 2015, 20, "Biblioteca")

    while (true) {
        println("Menú:")
        println("1. Cambiar estado civil")
        println("2. Reasignar despacho")
        println("3. Matricular estudiante")
        println("4. Cambiar departamento")
        println("5. Trasladar sección")
        println("6. Imprimir información")
        println("7. Salir")

        print("Ingrese una opción: ")
        val opcion = readLine()?.toIntOrNull() ?: continue

        when (opcion) {
            1 -> {
                // ... implementación para cambiar estado civil
            }
            2 -> {
                // ... implementación para reasignar despacho
            }
            // ... otros casos
            7 -> break
            else -> println("Opción inválida")
        }
    }
    personas.add(estudiante1)
    personas.add(profesor1)
    personas.add(personalServicio1)

    for (persona in personas) {
        println(persona)
    }

    cambiarEstadoCivil(estudiante1, "Casado")
    reasignarDespacho(profesor1, 102)
    matricularEstudiante(estudiante1, "2º")

    println("\nDespués de los cambios:")
    for (persona in personas) {
        println(persona)
    }

}

fun reasignarDespacho(profesor1: Profesores, i: Int) {
    TODO("Not yet implemented")
}

fun cambiarEstadoCivil(estudiante: Estudiante, s: String) {
    TODO("Not yet implemented")
}

fun matricularEstudiante(estudiante1: Estudiante, s: String) {
    TODO("Not yet implemented")
}
