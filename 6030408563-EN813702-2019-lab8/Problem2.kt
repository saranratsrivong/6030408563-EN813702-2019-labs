fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10){
        fortune = getFortune(getBirthday())
        println("\nYour forturn is: $fortune")
        if (fortune.contains("Take it easy"))break;
    }
}
fun getBirthday() : Int?{
    print("Enter your birthday: ")
    val birthday = readLine()!!.toIntOrNull()
    return birthday
}
fun getFortune(birthday : Int?) : String {
    val modDay : Int? = birthday?.rem(7)
    val luck = listOf("You will have a great day!","Things will go well for you today.",
        "Enjoy a wonderful day of success.","Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.","Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    if (modDay != null) {
        if (birthday in 1..7){
            return "Have a good start the first week of month"
        }else if (birthday == 28 ){
            return "Enjoy that last days of month"
        }else if (birthday == 31 ){
            return "Enjoy that last days of month"
        }else if (birthday<=0){
            return "Please enter a valid birthday (1-31)"
        }else if (birthday >=32){
            return "Please enter a valid birthday (1-31)"
        }else{
            return luck[modDay]
        }
    }else{
        return "Please enter a valid birthday (1-31)"
    }
}