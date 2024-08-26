open class Persona (
    val nombre: String,
    val apellido: String,
    val identificacion: String,
    var estadoCivil: String
){
    fun ImprimirInformacion(){
        println("Nombre: $nombre $apellido, ID: $identificacion, Estado Civil: $estadoCivil")
    }

    fun cambiarEstadoCivil(nuevoEstadoCivil:String){
        estadoCivil=nuevoEstadoCivil
    }
}
