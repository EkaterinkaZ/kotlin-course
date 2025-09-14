package Stimmax.Lessons.Lesson4.lesson03

const val wheels = 4

class Auto {
    private val vincode: String = "VIN55387394"

    var color: String = "red"

    var mileage: Int = 0

    lateinit var ownername: String

    val utilreport: String by lazy {
        "sample text"
    }

}