package Lesson2
// переменная вне функции main - глобальная (видна как вне функции, так и в самой функции main)
// если переменная создана внутри функции то она локальная (видна только в той функции в которой прописана)
var hello = "Hello, Vlad"
var number1 = 34
var number2 = 4


fun main(args: Array<String>){
    // var - можно переприсвоить
    // val - нельзя переприсвоить


    var age: Int? = null
    age = 75
    println("Перемменная: $age")

    var name: String = "Vlad"
    var firstChar: Char = 's'

    var isTrue: Boolean = false
    var num: Float = 4.5F
    var num2: Double = 5235.23523

    val number: Int = 4
    var res = number1+number2
    res += 10
    print("Результат: $res")

}