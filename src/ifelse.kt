fun main() {
hours()
}
fun hours(){
    println("how many hours do you spend on instagram in a day: ")
    var numberOfHours= readLine()
    if (numberOfHours!!.isEmpty()) return
    var hours=numberOfHours.toInt()
        if (hours>= 6) {
            println("you should do an Instagram detox one of this fine days!")
        } else {
            println("you are on the right track,keep it at that!")
        }

    }
