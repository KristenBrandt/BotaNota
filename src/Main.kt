 class Main {

    fun main(args: Array<String>) {
        val cajaChocolate = Caja<Chocolate>(ArrayListof<Chocolate>(
                Cholate("Chocolate 1", "3000", "Oscuro"),
                Cholate("Chocolate 2 ", "6000", "Leche"),
                Cholate("Chocolate 3", "5000", "Amaretto"),
                Cholate("Chocolate 4", "1000", "Nuez")
        ));
        val hacer = Forrest<Chocolate>(cajaChocolate);
        println(hacer.accion())
        println(hacer.accion())
        println(hacer.accion())
        println(hacer.accion())
        println(hacer.accion())
        println(hacer.accion())
        println(hacer.accion())

    }
}