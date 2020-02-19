package srivong.saranrat.lab9

import org.w3c.dom.Text

open class Book(val title: String, val author: String){
    protected var currentPage = 1
    open fun readPage() {
        currentPage++
    }

    override fun toString(): String {
        return "Title: $title Author: $author CurrentPage: $currentPage\n"
    }
}

fun main(args: Array<String>){
    var b1 = Book("Principles","Ray Dalio")
    b1.readPage()
    println(b1)

    var eb1 = eBook("How Will You Measure Your Life?","Clayton M. Christensen")
    println(eb1)
    eb1.readPage()

    var eb2 = eBook("End of Days: Predictions and Prophecies about the End of the World",
        "Sylvia Browne")
    eb2.readPage()
    eb2.readPage()
    println(eb2)
}

class eBook(title: String, author: String,val format: String = "text") : Book(title, author){

    override fun readPage() {
        super.readPage()

   }

    override fun toString(): String {
        return super.toString()+ "Format: $format WordCount: ${currentPage*250}"
    }
}

