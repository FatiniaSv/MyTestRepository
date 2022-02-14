interface Expr
class Num(val value : Double) : Expr
class Min(val left : Expr,  val right : Expr) : Expr

fun subtract ( e  : Expr) : Double =
    when(e) {
        is Num -> e.value
        is Min -> subtract(e.left) - subtract(e.right)
        else->
            throw java.lang.IllegalArgumentException("Unnown")
    }

fun main(args: Array<String>) {
   // println("Hello World!")
    println(subtract(Min(Num(8.1),Num(5.0))))
    for (i in 1..15){
        println(gameBaz(i))
    }
    println(exmThtow(9))
    val num  = intArrayOf(0,0,0,1,1,2,3,3,3)
    val k = remoneDublicates(num)
    println("$k")

val s =("asdfghjk").toCharArray()

    reverseString(s)


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}