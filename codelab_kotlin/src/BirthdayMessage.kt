fun main(){
    val border = "´-._,-'"
    val timesToRepeat = 4

    printBorder(border, timesToRepeat)
    println("Happy Birthday, César!")
    printBorder(border, timesToRepeat)


//    val age = 19
//    val name = "César"
//
//    println("Happy birthday, $name!")
//
//    println("   ,,,,,   ")
//    println("   |||||   ")
//    println(" ========= ")
//    println("@@@@@@@@@@@")
//    println("{~@~@~@~@~}")
//    println("@@@@@@@@@@@")
//
//    println("")
//
//    println("You are already $age!")
//    println("$age is the very best age to celebrate!")
}

fun printBorder(border: String, timesToRepeat: Int){
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}