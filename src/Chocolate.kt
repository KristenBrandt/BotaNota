class Chocolate(val nombre: String){
    override fun toString(): String {
        return """
            $nombre
        """.trimIndent()
    }
}