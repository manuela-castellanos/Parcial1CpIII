class PersonalServicio (var incorporacion:String="", var seccion:String) : Vinculados ("10423009", "Lucia","Orduy","Casada"){

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
        println("Estado Civil ${estadoCivil}")
    }
    fun incorporacion(){
        println("Año de incorporacion ${incorporacion}")
    }

    fun seccion(){
        println("Seccion ${seccion}")
    }

    open fun estadocivil1(estadocivil1:String=""){
        var estadocivil1= readln().toString()
    }


    override fun toString(): String {
        return "PersonalServicio(Incorporacion='$incorporacion', seccion='$seccion')"
    }


}