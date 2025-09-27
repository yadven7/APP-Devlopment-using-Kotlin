fun main() {

//    println(square(2))
//    var sq = :: square
//    println("square is : ${sq(3)}")
//    var n = 6
//    var m = 3
//    var add =  add(2,5,7)
//    println("$add")
//    add(n, m)
  //  println("addition is $add")

    var a = 100
    var b= 20
    arithematic(a,b,::add)
    arithematic(a,b,::sub)
    arithematic(a,b,::div)
    arithematic(a,b,::mul)

}

fun arithematic(a: Int,b: Int,fn:(Int,Int)->Int) {
    var result = fn(a,b)
    println("Result is $result")
}

fun square(num:Int):Int{
    return num*num
}
fun sub(a:Int,b: Int):Int{
    return a-b
}
fun div(a:Int,b: Int):Int{
    return a/b
}
fun mul(a:Int,b: Int):Int{
    return a*b
}



fun add(a1:Int,a2:Int ):Int{
//     println(a1+a2)
    return a1+a2
}
//fun add(a1:Int,a2:Int, a3:Int):Int{
//
//    return a1+a2+a3
//}

//fun arihematic(a:Int,b:Int,fn:(Int,Int)->Int){
//    var result = fn(a,b)
//    println("Result is $result")
//}
//fun add(a1:Int,a2:Int ) = a1*a2
//

//fun add(a1:Int,a2:Int ):Int{
//    return a1+a2
//}
//    for(i in 10 downTo 1){
//        println("$n * $i = ${i*n}")
//    }
//    while(i <= 10){
//        println(" This is loop upto 10 $i")
//        i++
//    }
//
//    do {
//        println(" this is do ")
//        println("its while")
//        i++
//    } while (i < 5)

//}

//    var a = 13
//    var b= 12
//    var opr = "add"
//    var c = when (opr){
//        "add" -> a+b
//        "sub" -> a-b
//        else -> 0
////        11 -> println("11")
////        12 -> println("12")
////        in 13 until 16 ->{
////            println("a is equal or between 13 to 16")
////        }
////        else -> println("this is invalid entry ")
//    }
//    println("result is : $c")
//


//    val x = 5
//    var y = 4
//    val areBothSmaller = x<y || y<x
////    println(areBothSmaller)
//    println("value of x is $x")
//    println("value of y is $y")
//    println("Addition  of $x and $y is ${x+y}")
//    val e: Double = 10.7
////    println(e)
//    val i = 10;
//    val j = 20;
//
//    println("i>j : ${i>j}")
//    println("i<j : ${i<j}")
//    println("i>=j : ${i>=j}")
//    println("i<=j : ${i<=j}")
//    println("i!=j : ${i!=j}")
// }}
//