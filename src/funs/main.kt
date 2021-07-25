package funs

fun sayHello(first:String, number: Int){                               //функция название(параметры которые принимает функция) {тело функции}
    println("$first - $number")                                           //написать ("$first - $number")
}

fun add(x:Int, y:Int):Int {                                            //функция add (принимает входные параметры x:int, y:int)
    return x+y                                                         //возвращает результат x+y
}

fun saySomething(first: Boolean):String = "hello world $first"                            // функция, которая принимает в себя число булиан и возвращает строку

fun main (args: Array<String>){
    sayHello("Hello", 24)                               //обращение к функции
    val result = add(5,55)                                      // неизменяемая переменная result равняется функции add и передает функции параметры (x: 5, y:55)
    println(result)                                                     // написать result
    println(saySomething(true))
}