package Stimmax.Lessons.Lesson4

val myInt: Int = 5
val myFloat: Float = 0.58F
val myLong: Long = 123456789L
val myShort: Short = 32000
val myByte: Byte = 120
val myDouble: Double = 5.99
val isKotlinFun: Boolean = true
val letter: Char = 'A'
val text: String = "Hello, Kotlin!"

val numbers: Array<Int> = arrayOf(1, 2, 3)
val strings: List<String> = listOf("one", "two", "one")
val doubles: Set<Double> = setOf(23.3, 56.8)

val unit: Unit = Unit
val KeysToValues: Map<Int, String> = mapOf(
    1 to "Значение1",
    2 to "Значение 2",
)

fun main() {
    val r: Float = myInt + myFloat
    myLong
}

fun example(): Nothing {
    throw RuntimeException("")
}