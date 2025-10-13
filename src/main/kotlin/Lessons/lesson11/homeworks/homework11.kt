package stimmax.lessons.lesson11.homeworks



//1. Не принимает аргументов и не возвращает значения.

//fun first() {
//    sayHello()
//}

//2. Принимает два целых числа и возвращает их сумму.

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val result = sum(2, 3)
    println(result) // Выведет: 5
    greet("Мир")
    println(n)

    val result2 = multiplyByTwo(5)
    println(result2)
}

//3. Принимает строку и ничего не возвращает.

fun greet(name: String) {
    println("Привет, $name!")
}

//4. Принимает список целых чисел и возвращает среднее значение типа Double.

fun calculateAverage(numbers: List<Int>): Double {
    return numbers.average()
}

//5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.

var nullableString: String? = null

//6. Не принимает аргументов и возвращает nullable вещественное число.

val n = null

//7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.

fun processNullableList(numbers: List<Int>?) {
}

//8. Принимает целое число и возвращает nullable строку.

fun convertIntToNullableString(number: Int): String? {
    return number.toString()
}

//9. Не принимает аргументов и возвращает список nullable строк.
fun getNullableStrings(): List<String?> {
    return listOf("apple", null, "banana")
}

//10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.

fun nullableValues(myString: String?, myInt: Int?): Boolean? {
    // Проверяем, что оба значения не null
    if (myString != null && myInt != null) {
        // Если значения не null, выполняем какую-то логику
        return myString == "test" && myInt > 10
    } else {
        // Если хотя бы одно из значений null, возвращаем null
        return null
    }
}
// 11. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

fun multiplyByTwo(number: Int): Int {
    return number * 2
}


// 12. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// 13. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

fun printNumbersUntil(n: Int) {
    for (i in 1..n) {
        return
    }
}
// 14. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное
// число в списке. Если отрицательных чисел нет, функция должна вернуть null.

fun findFirstNegative(numbers: List<Int>): Int? {
    return numbers.firstOrNull { it < 0 }
}

// 15. Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить
// каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

fun processList(stringList: List<String>) {
    for (str in stringList) {
        println(str)
        if (value == null) {
            return
        }
    }
}
