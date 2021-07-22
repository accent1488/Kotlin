package NPEAndNullSafety

fun main(args: Array<String>){
    val st: String?
    st = getSt()

    val size = st!!.length

    print(size)
}

fun getSt(): String? {
    return null
}