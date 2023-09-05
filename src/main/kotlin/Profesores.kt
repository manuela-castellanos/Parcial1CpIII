class Profesores (var incorporacion1:String="", var ndespacho:String="", var departamento:String="") : Vinculados ("25489030", "Javier", "Ballen", "Casado") {

    fun id(){
        println("Id ${id}")
    }

    fun nombre(){
        println("Nombre ${nombre}")
    }

    fun apellido(){
        println("Apellido ${apellido}")
    }

    fun estadocivil(){
        println("Estado civil ${estadoCivil}")
    }
    fun incorporacion(){
        println("Año de incorporacion ${incorporacion1}")
    }

    fun ndespacho(){
        println("Numero despacho ${ndespacho}")
    }

    fun departamento(){
        println("Departamento ${departamento}")
    }

    open fun estadocivil1(estadocivil1:String=""){
        var estadocivil1= readln().toString()
    }


    override fun toString(): String {
        return "Profesores(Incorporacion1='$incorporacion1', ndespacho=$ndespacho, departamento='$departamento')"
    }
}