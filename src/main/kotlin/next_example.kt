fun gameBaz(i : Int) = when{
    i % 5 == 0 -> "good"
    i % 2 == 0 -> "chet"
    else -> "$i"
}
fun exmThtow(i : Int) {
    if(i !in 1..10){
        throw IllegalArgumentException(" Illegal Argument $i")
    }
    println("good number $i")
}
