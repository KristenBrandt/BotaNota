fun main(args: Array<String>) {
        val cajaChocolate = Caja<Chocolate>(arrayListOf<Chocolate>(
                Chocolate("Chocolate de Leche"),
                Chocolate("Chocolate Oscuro"),
                Chocolate("Chocolate de Nuez"),
                Chocolate("Chocolate Amaretto")
        ));

        val hacer = Forrest<Chocolate>(cajaChocolate)
        println(hacer.accion())
        println(hacer.accion())
        println(hacer.accion())
        println(hacer.accion())
        println(hacer.accion())
        println(hacer.accion())
        println(hacer.accion())

    }

