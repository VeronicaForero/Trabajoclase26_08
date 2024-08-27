class Personal_de_servicio(
    nombre: String,
    apellidos: String,
    identificacion: String,
    estadoCivil: String,
    yearsIncorporacion: Int,
    numeroDespacho: Int,
    var seccion:String):


         Empleado(nombre, apellidos, identificacion, estadoCivil, yearsIncorporacion.toString(),
             numeroDespacho.toString()
         ) {

    fun trasladarSeccion(nuevaSeccion: String) {
        seccion = nuevaSeccion
    }

     override fun imprimirInformacion() {
        super.imprimirInformacion()
        println("Sección: $seccion")
    }
}

