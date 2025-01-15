package srangeldev

fun main() {

    // EJERCICIOS FUNCIONES LAMBDA

    // Suma de tres números 3, 7, 12
    val suma = { a: Int, b: Int, c: Int -> a + b + c }
    val resultado = suma(3, 7, 12)
    println(resultado)

    //Multiplicación de cadenas
    val cadena = { a: String, b: String -> a + b }
    val resultadoCadena = cadena("Kotlin", "3")
    println(resultadoCadena)

    //Invertir cadenas
    val cadenaInvertida = { a: String, b: String -> b + a }
    val resultadoInvertida = cadenaInvertida("Funcional", "Lambda")
    println(resultadoInvertida)

    //Calcular el área de un triángulo base 4 altura 6
    val calculoArea = {base: Int, altura: Int -> base * altura / 2}
    val resultadoCalculoArea = calculoArea(4, 6)
    println(resultadoCalculoArea)

    // EJERCICIOS FUNCIONES ANONIMAS

    //Determinar impar
    val comprobarNumero = fun(a:Int): String {
        return if (a % 2 == 0) "false" else "true"
    }
    val resultadoComprobarNumero = comprobarNumero(11)
    println(resultadoComprobarNumero)

    //Cubo de un numero: 3
    val cuboNumero = fun(a:Int): Int {
        return (a * a * a)
    }
    val resultadoCuboNumero = cuboNumero(3)
    println(resultadoCuboNumero)

    //Comprobar positivo o negativo
    val comprobarNumero2 = fun(a:Int): String {
        return if (a >= 0) "true" else "false"
    }
    val resultadoComprobarNumero2 = comprobarNumero2(-3)
    println(resultadoComprobarNumero2)
    val resultadoComprobarNumero3 = comprobarNumero2(0)
    println(resultadoComprobarNumero3)
    val resultadoComprobarNumero4 = comprobarNumero2(5)
    println(resultadoComprobarNumero4)

    //Saludo formal
    val saludo = fun(titulo: String, nombre: String): String {
        return "Buenos dias, $titulo $nombre"
    }
    val resultadoSaludo = saludo("Dra.", "Ana")
    println(resultadoSaludo)

    //Producto de un array
    val sumaArray = fun (array: IntArray): Int {
        var sumaValores: Int = 0
        for (i in array.indices) {
            sumaValores += array[i]
        }
        return sumaValores
    }
    val array = intArrayOf(1,2,3,4,5)
    val resultadoArray = sumaArray(array)
    println(resultadoArray)

    // EJERCICIOS FUNCIONES DE ORDEN SUPERIOR

    // Aplicar función personalizada
    fun aplicarFuncion(a: Int, b: Int, op: (Int, kotlin.Int) -> Int): Int {
        return op(a, b)
    }
    val resta = aplicarFuncion(3, 2) { a, b -> a - b }
    val division = aplicarFuncion(15, 5) { a, b -> a / b }

    println(resta)
    println(division)

    //Crear divisor
    fun crearDivisor(divisor: Int): (Int) -> Int {
        return { num: Int -> num / divisor }
    }
    val dividirPor2 = crearDivisor(2)
    val dividirPor4 = crearDivisor(4)

    println(dividirPor2(10))
    println(dividirPor4(16))
}

