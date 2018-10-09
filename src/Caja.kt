import java.util.*

class Caja <T> (val buffer: ArrayList<T>){
    fun escogerUno(): T? {
        if (buffer.size > 0) {
            return buffer.removeAt(Random().nextInt(buffer.size))
        }
        return null
    }
}

