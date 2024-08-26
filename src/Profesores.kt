class Profesores(nombre:String, apellidos:String, identificacion:String, estadocivil:String, numeroDespacho: Int, yearsIncorporacion: String, var departamento:String):


    Empleado(nombre, apellidos,identificacion,estadocivil,yearsIncorporacion, numeroDespacho.toString()){

         fun cambiarDepartamento(nuevoDepartamento:String){
             departamento=nuevoDepartamento
         }
     override fun imprimirInformacion(){
        super.imprimirInformacion()
        println("Departamento: $departamento")

     }

    }
