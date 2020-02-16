
import java.util.*


fun main(args: Array<String>) {

    print("Enter your birthday: ")


    val birthday = readLine()!!.toIntOrNull()

    //val compare = if (birthday != null) true else false

    val message = "${if (birthday != null) "${getFortuneCookie(birthday)}" else "Please enter your birthday"}"


    println(message)
    //print(getFortuneCookie())
}

fun getFortuneCookie(birthday:Int): String {
    val modDay : Int = birthday?.rem(7)
    val luck = listOf("You will have a great day!","Things will go well for you today.",
        "Enjoy a wonderful day of success.","Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.","Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    return luck[modDay]

}