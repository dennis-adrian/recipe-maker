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
        do{
            println(menu)
            val response: String? = readLine()
            when(response?.toInt()){
                1 -> println(makeRecipe())
                2 -> println(viewRecipe())
                3 -> println("Hasta la Proxima!!!")
                else -> println("Elige una opcion valida")
            }
        }while (response?.toInt() != 3)
    } catch (e: NumberFormatException){
        println("Tiene que ingresar un numero")
    }
}
fun makeRecipe() : String {
    val ingredients: String = """
        Hacer receta
        Selecciona por categoría el ingrediente que buscas
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceites
    """.trimIndent()
    return ingredients
}
fun viewRecipe(): String {
    return "Ver mis recetas"
}