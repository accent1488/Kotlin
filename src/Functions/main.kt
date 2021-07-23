package Functions

fun main(args: Array<String>){
    myFirstFunction()
    myFirstFunction2(1)
    val result = myFirstFunction4(2,3.2)
    println(result)
}

fun myFirstFunction(): Int{
    return 1
}

fun myFirstFunction2(a: Long):Int{
    return a.toInt()
}

fun myFirstFunction3(){

}

fun myFirstFunction4(a:Long, b:Double) = a+b