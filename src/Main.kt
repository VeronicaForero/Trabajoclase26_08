fun main() {

    // Creación de un estudiante
    val estudiante = Estudiante("Luna", "Ramirez", "85845", "Soltera", " 5")
    estudiante.imprimirInformacion()

    // Cambiar el estado civil
    estudiante.cambiarEstadoCivil("Casada")
    println("\nDespués de cambiar el estado civil:")
    estudiante.imprimirInformacion()

    // Matricular en un nuevo curso
    estudiante.matricularenuevoCurso("2")
    println("\nDespués de matricular en un nuevo curso:")
    estudiante.imprimirInformacion()

    // Creación de un profesor
    val profesor = Profesores("Fainory", "Pulido", "287463", "Casada", 202, "2012", "Matemáticas")
    profesor.imprimirInformacion()

    // Cambio de departamento
    profesor.cambiarDepartamento("Física")
    println("\nDespués de cambiar de departamento:")
    profesor.imprimirInformacion()

    //Personal de servicio
    val personalServicio = Personal_de_servicio("Daniel", "Martínez", "82744", "Soltero", 2002, "24", "Biblioteca")
    personalServicio.imprimirInformacion()

    // Traslado de sección
    personalServicio.trasladarSeccion("Decano")
    println("\nDespués de trasladar la sección:")
    personalServicio.imprimirInformacion()
}