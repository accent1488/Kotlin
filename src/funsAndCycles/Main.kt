package funsAndCycles

fun printSome(item: String = "Hi", vararg word: Any){
    print("$item: ")
    word.forEach { el -> print("$el, ") }
    println("")
}

fun main(args: Array<String>){
    var names = arrayOf("Bob","John","Alex", 1, true)
    printSome()
    printSome(word = "Hi")
    printSome(word = "Hi",item =  "Some")
    printSome("Hi", "Some", "Hello")
    printSome("Hi", *names)
}
