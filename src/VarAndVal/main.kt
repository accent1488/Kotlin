package VarAndVal

fun main(args: Array<String>){
    val UserJava = UserJava("vlad@gmail.com")
    println("Java example: ${UserJava.email}")
//    userJava.email = "sdfsdfsd"

    var userKotlin = UserKotlin("test@gmail.com")
    println("Kotlin example: ${userKotlin.email}")

    var name: String = "qweqweqw"
    val name2: String = "qweqwe"

}

