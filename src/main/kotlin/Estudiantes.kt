class Estudiantes (var curso:String=""):Vinculados("9764534","Daniela","Castellanos", "Soltera"){

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

    fun curso(){
        println("Curso ${curso}")
    }

    open fun estadocivil1(estadocivil1:String=""){
        var estadocivil1= readln().toString()
    }


    override fun toString(): String {
        return "Estudiantes(curso='$curso')"
    }
}