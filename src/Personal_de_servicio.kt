class Personal_de_servicio(
    nombre: String,
    apellidos: String,
    identificacion: String,
    estadoCivil: String,
    yearsIncorporacion: Int,
    numeroDespacho:String,
    var seccion:String):


         Empleado(nombre, apellidos, identificacion, estadoCivil, yearsIncorporacion.toString(), numeroDespacho) {

    fun trasladarSeccion(nuevaSeccion: String) {
        seccion = nuevaSeccion
    }

     override fun imprimirInformacion() {
        super.imprimirInformacion()
        println("Sección: $seccion")
    }
}

