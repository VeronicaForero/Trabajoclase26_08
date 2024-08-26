class Estudiante (nombre: String, apellidos: String, identificacion: String, estadoCivil: String, var cursoMatriculado: String):

        Persona(nombre, apellidos, identificacion,estadoCivil){

     fun matricularenuevoCurso(nuevoCurso: String){

         cursoMatriculado=nuevoCurso
     }

    fun imprimirInformacion(){
        super.ImprimirInformacion()
        println("Curso Matriculado: $cursoMatriculado")

    }
}