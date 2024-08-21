package Task5

fun main() {
    println("Что это такое: синий, большой, с усами и полностью набит зайцами?")
    for (i in 1..3) {
        var ansver = readln()
        if (ansver == "Тролейбус") {
            println("Правильный ответ")
            break
        }else if (ansver=="Сдаюсь"){
            println("Правильный ответ - тролейбус")
            break
        }else {
            println("Попробуй еще раз")
        }
    }
        // Здесь не могу понять как при использовании when завершить цикл.
       // При использовании операторов break и return возникает ошибка

//    for (i in 1..3){
//        var ansver = readln()
//        when (ansver){
//            "Тролейбус" -> println("Правильный ответ")
//            "Сдаюсь" -> println("Правильный ответ - тролейбус")
//            else -> println("Попробуй еще раз")
//        }
//    }
}
