fun main(args: Array<String>) {
    print(whatShouldIDoToday("happy"))
}
fun whatShouldIDoToday(
    mood : String,
    weather : String = "sunny",
    temperature:Int = 24): String {

    if (mood =="happy" && weather == "sunny"){
        return "go for a walk"
    }else{
        return "Stay home and read"
    }
}