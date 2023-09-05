fun main() {

    var personalServicio = PersonalServicio("Año 2015", "Secretaria")
    println("Datos de un trabajador del personal del servicio: id = ${personalServicio.id}, nombre = ${personalServicio.nombre}, apellido = ${personalServicio.apellido}, estado civil = ${personalServicio.estadoCivil}, año incorporacion = ${personalServicio.incorporacion}, seccion asignada = ${personalServicio.seccion}")

    println()

    var estudiantes = Estudiantes("501")
    println("Datos de un estudiante: id = ${estudiantes.id}, nombre = ${estudiantes.nombre}, apellido = ${estudiantes.apellido}, estado civil = ${estudiantes.estadoCivil}, curso = ${estudiantes.curso}")

    println()

    var profesores = Profesores("2020", "3 despacho", "Matematicas")
    println("Datos de un profesor: id = ${profesores.id}, nombre = ${profesores.nombre}, apellido = ${profesores.apellido}, estado civil ${profesores.estadoCivil}, incorporacion = ${profesores.incorporacion1}, despacho = ${profesores.ndespacho}, departamento = ${profesores.departamento}")


    println("Cambie el estado civil de profesor")
    var estadocivil1 = readln().toString()

    var profesores1 = Profesores("2020", "3 despacho", "Matematicas")
    println("Datos de un profesor: id = ${profesores1.id}, nombre = ${profesores1.nombre}, apellido = ${profesores1.apellido}, estado civil ${profesores1.estadocivil1("")}, incorporacion = ${profesores.incorporacion1}, despacho = ${profesores.ndespacho}, departamento = ${profesores.departamento}")

}