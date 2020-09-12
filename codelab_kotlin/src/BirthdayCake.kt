fun main(){
    val age = 24
    val layers = 5

    printCakeCandle(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCakeCandle(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()

    print(" ")
    repeat(age){
        print("|")
    }
    println()
}

fun printCakeTop(age: Int){
    repeat(age + 2){
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int){
    repeat(layers){
        repeat(age + 2){
            print("@")
        }
        println()
    }

}