package if_else_when
// || = "или", && = "и"

fun main (args: Array<String>){
    var word: String? = null
    var isHasCar = true
    //word = "asd"

    if(word == null){                           // если word равняется null
        println("переменная $word равна null")  //написать

        if (!isHasCar || word == null){         // если isHasCar равно false или word равняется null (ВЫПОЛНИТЬ КОД ДАЖЕ ЕСЛИ ОДНО УСЛОВИЕ НЕ ВЕРНО)
            println("чтото сработало")
        }
    } else if(word == "asd"){                   // иначе если word равняется asd
        println("переменная: $word")            // написать
    }
        else {                                  // иначе
        print("переменная не равна null")
    }

    val number = 5
    when(number){                                   //когда переменная number
        null -> print("Переменная равна null")      //равна null написать
        10   -> print("Переменная равна 10")          //равна 10 написать
        5 -> print("Переменная равна 5")             //равноа 5 написать
        140   -> print("Переменная равна 140")      //равна 140 написать
        1   -> print("Переменная равна 1")          //равна 1 написать
        else -> print("переменная неизвестна")      // иначе написать
    }

//    var res = 0
//    if(number>30)                 если nubmer больше 30
//        res = 1                   присвоить res = 1
//    else                          иначе
//        res = 10                  присвоить res = 10

    var res = if(number>30) 1 else 0        //если number > 30 присвоить res 1 иначе присвоить res 0

    val words = when(number){               // когда number
        null -> "равна null"                // равняется null написать
        else -> number                      // иначе присвоить words = number
    }
}