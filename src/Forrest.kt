class Forrest <T> (val cosa: Caja<T>){


    fun accion():String {
        val agarrado = cosa.pickOne()
        if (agarrado == null){
            return "No hay chocolate"
        }
        return "Life is like a box of chocolates" \n${agarrado}

    }

}