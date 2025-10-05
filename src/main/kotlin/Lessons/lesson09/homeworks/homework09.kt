package stimmax.lessons.lesson09.homeworks
import java.util.Arrays

//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    println(numbers.contentToString())
    println(emptyStringArray.contentToString())
    println(Doubles.contentToString())
    println(newInt.contentToString())
    println(emptyNullableArray.contentToString())
    //println("Исходный массив: ${oldArray.contentToString()}") // Вывод: [10, 20, 30, 40]
    //println("Новый массив: ${newArray.contentToString()}") // Вывод: [10, 20, 30, 40]

    println("Исходный массив: ${sourceArray.contentToString()}") // Вывод: [1, 2, 3, 4, 5]
    println("Новый массив: ${newArray.contentToString()}")
    println(differenceArray)
    val evenNumbers = ""
    println("Чётные числа: $evenNumbers") // Вывод: Чётные числа: [2, 4, 6, 8, 10]
    val oddNumbers = ""
    println("Нечётные числа: $oddNumbers") // Вывод: Нечётные числа: [1, 3, 5, 7, 9]

    println(emptyIntList)
    println(readOnlyList)
    println(numbersExplicit)


    //set
    println(emptyIntSet)
    println(numbersSet)
    println(languages)

}


//Создайте пустой массив строк размером 10 элементов.

    val emptyStringArray: Array<String> = Array(10) { "" }

//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.

    val Doubles = Array(5) { index -> index.toDouble() * 2.0 }

//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.

    val newInt = Array(5) { index -> index.toInt() * 3}

//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.

    val emptyNullableArray : Array<String?> = arrayOf(null, "строка1", "строка2")

//Создайте массив целых чисел и скопируйте его в новый массив в цикле.

//    val oldArray = intArrayOf(10, 20, 30, 40)
//    val newArray = IntArray(oldArray.size) // Создаем новый массив нужного размера
//
//    for (i in oldArray.indices) {
//        newArray[i] = oldArray[i]
//    }

    val sourceArray = intArrayOf(1, 2, 3, 4, 5)
    val newArray = Arrays.copyOf(sourceArray, sourceArray.size) // Копируем все элементы

//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    val firstArray = listOf(1, 2, 3, 4, 5)
    val secondArray = listOf(3, 5, 6, 7, 9)
    val differenceArray =  secondArray - firstArray

//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.

fun findIndexOfFive(array: IntArray): Int {
    var i = 0 // Инициализируем индекс
    val targetValue = 5 // Значение, которое ищем

    while (i < array.size) { // Пока индекс меньше длины массива
        if (array[i] == targetValue) { // Если текущий элемент равен 5
            return i // Возвращаем индекс
        }
        i++ // Переходим к следующему элементу
    }
    return -1 // Если цикл завершился и значение не найдено, возвращаем -1
}


//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “
// чётное” или “нечётное”.

fun task9() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = mutableListOf<Int>()
    val oddNumbers = mutableListOf<Int>()

    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number) // Добавить чётное число
        } else {
            oddNumbers.add(number) // Добавить нечётное число
        }
    }
//    println("Чётные числа: $evenNumbers") // Вывод: Чётные числа: [2, 4, 6, 8, 10]
//    println("Нечётные числа: $oddNumbers") // Вывод: Нечётные числа: [1, 3, 5, 7, 9]
}

//Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
// в котором принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.

fun findElementContainingSubstring(list: List<String>, substringToFind: String): String? {
    return list.find { it.contains(substringToFind) }
}

fun function() {
    val myList = listOf("apple", "banana", "orange", "grape")
    val searchString = "an"
    val foundElement = findElementContainingSubstring(myList, searchString)

    if (foundElement != null) {
        println("Найден элемент: $foundElement") // Вывод: Найден элемент: banana
    } else {
        println("Элемент не найден.")
    }
}

//Работа со списками List
//1. Создайте пустой неизменяемый список целых чисел.

    val emptyIntList: List<Int> = emptyList()

//2. Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").

    val readOnlyList = listOf("Hello", "World", "Kotlin")

//3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.

    val numbersExplicit = mutableListOf(1, 2, 3, 4, 5)

//4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).

fun wholeNumbers() {
    val myMutableList = mutableListOf(1, 2)
    myMutableList.add(1, 20)
}

//5. Имея изменяемый список строк, удалите из него определенный элемент (например, "World").

fun strings() {
    val stringList= mutableListOf(1, 2, 3, 2, 4)
    stringList.remove(2)
}

//6. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.

fun listWith() {
    // Создаем список целых чисел
    val elements = listOf(10, 20, 30, 40, 50)

    // Используем цикл for для вывода каждого элемента
    println("Элементы списка:")
    for (number in elements) {
        println(number)
    }
}
//7. Создайте список строк и получите из него второй элемент, используя его индекс.

fun listOfStrings() {
    // Создание списка строк
    val myStrings2 = listOf("Первый", "Второй", "Третий")

    // Получение третьего элемента (индекс 1)
    val thirdElement = myStrings2[2]

    // Вывод результата
    println("Третий элемент списка: $thirdElement")
}

//8. Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).

fun numbersList() {

    var myList = mutableListOf(10, 20, 30, 40)
    println("Исходный список: $myList") // Вывод: Исходный список: [10, 20, 30, 40]

    // 2. Определение позиции и нового значения
    val indexToChange = 1 // Изменяем второй элемент (индекс 1)
    val newValue = 25

    // 3. Изменение значения элемента на определенной позиции
    myList[indexToChange] = newValue
    println("Список после изменения: $myList") // Вывод: Список после изменения: [10, 25, 30, 40]
}

//9. Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.

fun cars() {
    // Создаем два исходных списка строк
    val list1 = listOf("BMW", "VW", "Opel")
    val list2 = listOf("Geely", "BYD", "Haval")

    // Создаем новый пустой список для объединенных элементов
    val mergedList = mutableListOf<String>()

    // Добавляем все элементы из первого списка
    for (item in list1) {
        mergedList.add(item)
    }

    // Добавляем все элементы из второго списка
    for (item in list2) {
        mergedList.add(item)
    }

    // Выводим объединенный список
    println("Объединенный список: $mergedList")
}

//10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.

fun min() {
    // 1. Создаем список целых чисел
    val numbers = listOf(5, 2, 8, 1, 9, 4)

    // Проверяем, не пуст ли список
    if (numbers.isEmpty()) {
        println("Список пуст.")
        return
    }

    // 2. Инициализируем минимальный и максимальный элементы первым элементом списка
    var min = numbers[0]
    var max = numbers[0]

    // 3. Используем цикл for для прохода по остальным элементам списка
    for (i in 1 until numbers.size) {
        val currentNumber = numbers[i]

        // Обновляем минимальный элемент, если текущий меньше
        if (currentNumber < min) {
            min = currentNumber
        }

        // Обновляем максимальный элемент, если текущий больше
        if (currentNumber > max) {
            max = currentNumber
        }
    }

    // 4. Выводим результаты
    println("Список: $numbers")
    println("Минимальный элемент: $min")
    println("Максимальный элемент: $max")
}

//11. Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.

fun newList() {
    val originalList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // Исходный список чисел
    val evenNumbers = mutableListOf<Int>() // Создаем пустой список для четных чисел

    for (number in originalList) { // Перебираем каждый элемент в исходном списке
        if (number % 2 == 0) { // Проверяем, является ли число четным (остаток от деления на 2 равен 0)
            evenNumbers.add(number) // Если число четное, добавляем его в список четных чисел
        }
    }

    println("Исходный список: $originalList")
    println("Список четных чисел: $evenNumbers") // Выводим полученный список
}


//Работа с Множествами Set
//1. Создайте пустое неизменяемое множество целых чисел.

    val emptyIntSet: Set<Int> = emptySet()

//2. Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
//
    val numbersSet: Set<Int> = setOf(1, 2, 3)

//3. Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").

    val languages: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")

//4. Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").

fun language () {
    val languagePopular: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Python")
    languages.add("Swift")
    languages.add("Go")
}

//5. Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).

fun minus() {
    val mySet = mutableSetOf(1, 2, 3, 4) // Создаем изменяемое множество
    println("Исходное множество: $mySet")

    mySet.remove(2) // Удаляем элемент 2
    println("После удаления 2: $mySet")
}
//6. Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.

fun newSet() {
    // Создание множества целых чисел
    val myNewSet: Set<Int> = mutableSetOf(1, 5, 2, 8, 2, 9)

    // Использование цикла for для вывода каждого элемента
    println("Элементы множества (цикл for):")
    for (element in myNewSet) {
        println(element)
    }

    // Альтернативный способ вывода с помощью forEach
    println("Элементы множества (forEach):")
    myNewSet.forEach { element ->
        println(element)
    }
}

//7 Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
// Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.

fun containsStringInSet(stringSet: Set<String>, searchString: String): Boolean {
    for (element in stringSet) { // Итерируем по каждому элементу в множестве
        if (element == searchString) { // Если текущий элемент совпадает с искомой строкой
            return true // Возвращаем true, так как строка найдена
        }
    }
    return false // Если цикл завершился, а строка не была найдена, возвращаем false
}
fun fruit() {
    val fruits = setOf("яблоко", "банан", "апельсин")
    val search1 = "банан"
    val search2 = "манго"

    println("Есть ли \"$search1\" в множестве? ${containsStringInSet(fruits, search1)}") // Вывод: Есть ли "банан" в множестве? true
    println("Есть ли \"$search2\" в множестве? ${containsStringInSet(fruits, search2)}") // Вывод: Есть ли "манго" в множестве? false
}


//8. Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.

fun uniqueElements() {
    // 1. Создаем два исходных множества строк
    val set1: Set<String> = setOf("яблоко", "банан", "апельсин")
    val set2: Set<String> = setOf("банан", "груша", "виноград")

    // 2. Создаем пустое изменяемое множество для результата
    val mergedSet: MutableSet<String> = mutableSetOf()

    // 3. Проходимся по первому множеству и добавляем элементы во второе
    for (element in set1) {
        mergedSet.add(element)
    }

    // 4. Проходимся по второму множеству и добавляем элементы в первое
    for (element in set2) {
        mergedSet.add(element)
    }

    // 5. Выводим объединенное множество
    println("Исходное первое множество: $set1")
    println("Исходное второе множество: $set2")
    println("Объединенное множество: $mergedSet")
}
//9. Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.

fun intersections() {
    // 1. Создаем два множества целых чисел
    val set3: Set<Int> = setOf(1, 2, 3, 4, 5, 6)
    val set4: Set<Int> = setOf(4, 5, 6, 7, 8, 9)

    // 2. Создаем пустое множество для хранения пересечения
    val intersection = mutableSetOf<Int>()

    // 3. Используем вложенные циклы для поиска общих элементов
    for (element1 in set3) { // Внешний цикл по первому множеству
        for (element2 in set4) { // Внутренний цикл по второму множеству
            if (element1 == element2) { // Проверяем, равны ли элементы
                intersection.add(element1) // Добавляем общий элемент в результирующее множество
                break // Выходим из внутреннего цикла, так как элемент уже найден
            }
        }
    }

    // 4. Выводим результат
    println("Первое множество: $set3")
    println("Второе множество: $set4")
    println("Пересечение множеств: $intersection")
}
//10. Создайте два множества строк и найдите разность первого множества относительно второго
// (элементы, присутствующие в первом множестве, но отсутствующие во втором). Реши задачу через вложенные циклы и переменные флаги.

fun cartoons() {
    // Создаем первое множество строк (А)
    val setA = setOf("The Lion King", "Moana", "Frozen", "Zootopia")

    // Создаем второе множество строк (Б)
    val setB = setOf("Beauty and the Beast", "The Little Mermaid", "Peppa pig", "Paw Patrol")

    // Находим разность А - Б
    val difference = setA - setB
    // Или: val difference = setA.minus(setB)

    println("Множество А: $setA")
    println("Множество Б: $setB")
    println("Разность (А - Б): $difference")
}
//11. Создайте множество строк и конвертируйте его в список с использованием цикла.

fun automobile() {
    // 1. Создаем множество строк
    val autoSet = setOf("Toyota", "Honda", "Nissan", "Haval")

    // 2. Создаем пустой изменяемый список
    val autoList = mutableListOf<String>()

    // 3. Конвертируем множество в список с помощью цикла for
    for (item in autoSet) {
        autoList.add(item) // Добавляем каждый элемент из множества в список
    }

    // Выводим результат
    println(autoList)
}