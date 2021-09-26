fun main() {
    println("Задача №2 - Люди/Человеки")
    println("Введите количество лайков")
    val likestxt = readLine()
    val likes = likestxt?.toInt()
    if (likes != null) {
        if ((likes % 2) == 0) {
            println("Понравилось $likes людям")
        } else {
            println("Понравилось $likes человеку")
        }
    }
}


