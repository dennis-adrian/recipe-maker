import java.lang.NumberFormatException

fun main() {

    val menu: String = """
            :: Bienvenido a Recipe Maker ::
            
            Selecciona la opción deseada
            
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent()
    try {
        do {
            println(menu)
            val response: String? = readLine()
        } while (response?.toInt() != 3)
    } catch (e: NumberFormatException){
        println("Tiene que ingresar un numero")
    }


}