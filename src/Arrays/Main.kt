package Arrays

fun printArray(items: Map<String, Any>) {
    items.forEach { key, value ->
        println("$key -> $value")
    }
}

fun main(args: Array<String>) {
    var items: Array<Any> = arrayOf(5, 7, 12, 4, 0, 1, "Hello", true)
    //var items_list =  listOf(5,7,12,4,0,1)
    var items_list = mutableListOf<Any>(5, 7, 12, 4, 0, 1)
    // val someArray = arrayOf()
//    println(items.set(0,45))
//    println(items[0])
//    println(items.get(1))
//    println(items.size)

    var dogs = listOf<Any>("Bob", "Charley")
    items_list.add("Dogs")
    items_list.addAll(4, dogs)


//    var user = mapOf("name: " to "Bob", "age :" to 1, "isHasCar" to true)
    var user = mutableMapOf("name: " to "Bob", "age :" to 1, "isHasCar" to true)
    user.put("city", "NY")

    printArray(user)
//    for (el in items)
//        println(el)
//
//    items.forEachIndexed() { index, el ->
//        println("$el с индексом $index")
//    }
//    user.forEach{ key, value -> println("$key -> $value")}
}