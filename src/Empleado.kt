open class Empleado(nombre:String, apellidos:String, identificacion:String, estadocivil:String, val yearsIncorporacion: String, var numeroDespacho: String):

        Persona(nombre,apellidos,identificacion,estadocivil){

        fun reasignarDespacho(nuevoDespacho:String){
            numeroDespacho=nuevoDespacho
        }

        open fun imprimirInformacion(){
            super.ImprimirInformacion()
            println("Año de incorporacion: $yearsIncorporacion, Numero de Despacho: $numeroDespacho")
        }
}