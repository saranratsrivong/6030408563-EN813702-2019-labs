fun main(args: Array<String>) {
    println("canAddFish(10.0, listOf(3,3,3)) is ${canAddFish(10.0, listOf(3,3,3))}")
    println("canAddFish(8.0, listOf(2,2,2), hasDecorations = false) is ${canAddFish(8.0, listOf(2,2,2),hasDecorations = false)}")
    println("canAddFish(9.0, listOf(1,1,3),3) is ${canAddFish(9.0, listOf(1,1,3),3)}")
    println("canAddFish(9.0, listOf(),7,true) is ${canAddFish(9.0, listOf(),7,true)}")
}
fun canAddFish(tankSize : Double, currentFish : List<Int>, fishSize : Int = 2, hasDecorations : Boolean = true):Boolean {
    var allFish = currentFish.sum() + fishSize
    val tankSize = if (hasDecorations != true) tankSize else tankSize*0.8

    val compare = if (tankSize >= allFish) true else false
    //println("fish tank is $tankSize")
    //println("all fish is $allFish")
    //print("compare is $compare")
    return when(compare){
        true ->  true
        else ->  false
    }
}