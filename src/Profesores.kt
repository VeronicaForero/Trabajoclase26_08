class Profesores(nombre:String, apellidos:String, identificacion:String, estadocivil:String, numeroDespacho: Int, yearsIncorporacion: Int, var departamento:String):


    Empleado(nombre, apellidos,identificacion,estadocivil, yearsIncorporacion.toString(), numeroDespacho.toString()){

         fun cambiarDepartamento(nuevoDepartamento:String){
             departamento=nuevoDepartamento
         }
     override fun imprimirInformacion(){
        super.imprimirInformacion()
        println("Departamento: $departamento")

     }

    }
