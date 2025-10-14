package stimmax.lessons.lesson12.homeworks

import java.util.Locale
import java.util.Locale.filter
import java.util.Locale.getDefault

//Задачи на приведение коллекции к значению
//Проверить, что размер коллекции больше 5 элементов.

fun main() {
    val myCollection = listOf(-1, 2, -3, 4, -5, 18, 264)

    if (myCollection.size > 5) {
        println("Размер коллекции больше 5")
    } else {
        println("Размер коллекции меньше или равен 5")
    }

//Проверить, что коллекция пустая

    if (myCollection.isEmpty()) {
        println("Коллекция пуста")
    } else {
        println("В коллекции ${myCollection.size} значений")
    }

//Проверить, что коллекция не пустая

    if (myCollection.isNotEmpty()) {
        println("Коллекция пуста")
    } else {
        println("В коллекции ${myCollection.size} значений")
    }



//Взять элемент по индексу или создать значение если индекса не существует

    println(myCollection.elementAt(1))

//Собрать коллекцию в строку

    val numbersString = myCollection.joinToString(separator = " : ")
    println(numbersString)

//Посчитать сумму всех значений

    val sumOfNumbers = myCollection.sum()
    println(sumOfNumbers)

//Посчитать среднее

    val averageOfNumbers = myCollection.average()
    println(averageOfNumbers)

//Взять максимальное число

    val maxNumber = myCollection.maxOrNull()
    println(maxNumber)

//Взять минимальное число

    val minNumber = myCollection.minOrNull()
    println(minNumber)

//Взять первое число или null

    println(myCollection.take(3))

//Проверить что коллекция содержит элемент

    if (myCollection.contains(42)) {
        println("Коллекция содержит элемент")
    } else {
        println("В коллекции нет элемента")
    }

    //Задачи на обработку коллекций
    //Отфильтровать коллекцию по диапазону 18-30

    val filteredNumbers = myCollection.filter { it in 18..30 }

    println(filteredNumbers)

    //Выбрать числа, которые не делятся на 2 и 3 одновременно

    val notDivideBy2Or3 = myCollection.filter { it % 2 != 0 && it % 3 != 0 }
    println("Числа, не делящиеся ни на 2, ни на 3: $notDivideBy2Or3")

    //Очистить текстовую коллекцию от null элементов

    val mutableList = mutableListOf("Привет", null, "мир", null, "Kotlin")
    mutableList.removeIf { it == null }
    println(mutableList)

    //Преобразовать текстовую коллекцию в коллекцию длин слов

    val textCollection = listOf("кот", "собака", "слон", "жираф")

    val wordLengths = textCollection.map { it.length } // Преобразование в коллекцию длин слов
    println(wordLengths)


    //Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов

    val reversedWordsMap = textCollection.associate { word ->
        word.reversed() to word.length
    }
    println(reversedWordsMap)

    //Отсортировать список в алфавитном порядке

    val sortedNumbers = myCollection.sorted()
    println(sortedNumbers)

    //Взять первые 3 элемента списка

    println(myCollection.take(3))

    //Распечатать квадраты элементов списка

    for (number in myCollection) {
        println(number * number)
    }

    //Группировать список по первой букве слов

   //? val groupedBySign = myCollection.groupBy { it.first().uppercase() }
    //?println(groupedBySign)

    //Очистить список от дублей

    val unique = myCollection.toSet().toList()

    //Отсортировать список по убыванию

    val sortedDescendingNumbers = myCollection.sortedDescending()
    println(sortedDescendingNumbers)

    //Взять последние 3 элемента списка

    println(myCollection.takeLast(3))

    //Характеристика числовой коллекции
    //Напиши функцию, которая принимает коллекцию чисел и возвращает строку с характеристикой коллекции используя конструкцию when
    //Если коллекция пустая - “Пусто”
    //Если количество элементов меньше пяти - “Короткая”
    //Если коллекция начинается с 0 - “Стартовая”
    //Если сумма всех чисел больше 10000 - “Массивная”
    //Если среднее значение равно 10 - “Сбалансированная”
    //Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
    //Если максимальное число меньше -10 - “Отрицательная”
    //Если минимальное число больше 1000 - “Положительная”
    //Если содержит одновременно числа 3 и 14 - “Пи***тая”
    //Иначе - “Уникальная”

    fun getCollectionCharacteristic(numbers: List<Int>): String {
        return when {
            numbers.isEmpty() -> "Коллекция пустая."
            numbers.all { it > 0 } -> "Коллекция содержит только положительные числа."
            numbers.any { it < 0 } -> "Коллекция содержит отрицательные числа."
            numbers.sum() == 0 -> "Сумма элементов равна нулю."
            else -> "Коллекция содержит смесь положительных, отрицательных и/или нулевых чисел."
        }
    }


    //Задача 25. Анализ учебных оценок
    //Напиши функцию, которая принимает список чисел и возвращает список чисел.
    //
    //Пример данных: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    //
    //Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать
// оставшиеся по возрастанию и взять первые 3. Вызывай методы обработки и фильтрации последовательно один из другого,
// чтобы результат предыдущего метода являлся основой для следующего.

    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)

    val positiveFiltered = grades.filter { it > 60 }
    val sortOfNumbers = grades.sorted()
    println(sortedNumbers)
    println(sortOfNumbers.take(3))

    //Создание каталога по первой букве
    //Напиши функцию, которая принимает список строк и возвращает словарь с ключом - буквой и значением - строкой.
    //
    //Начальные значения: val list = listOf(
    //"Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы",
// "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло",
// "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы",
// "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    //)
    //
    //Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве используя метод groupBy

    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик",
        "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод",
        "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка",
        "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир",
        "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )

    fun stringsToMap(strings: List<String>): Map<String, Char> {
        return strings.associateWith { it.first() }
    }
    val myMap = stringsToMap(list)
    val lowerCaseList = list.map { it.lowercase(getDefault()) }
    val groupedStrings = lowerCaseList.groupBy { it.first() }

    println(groupedStrings)

    //Задание 27. Подсчёт средней длины слов в списке
    //Напиши функцию, которая принимает список строк и возвращает строку.
    //
    //Начальные значения взять из предыдущей задачи.
    //
    //Цель: Перевести все слова в количество букв, подсчитать среднее значение. Вернуть форматированный текст с
// двумя знаками после запятой, используя функцию format и подходящий шаблон.

    val t1 = listOf("Привет", "Swift", "Java", "Kotlin!")
    val numbersResult = t1.joinToString(separator = " : ")
    println(numbersResult)

    val wordLength = t1.map { it.count() }
    val averageOfLength = wordLength.average()
    val formattedString = "%.2f".format(averageOfLength)
    println(formattedString)


    //Задание 28: Категоризация чисел
    //Напиши функцию, которая принимает список чисел и возвращает словарь с ключами - строками и значениями - числами.
    //
    //Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    //
    //Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).

    val numbers5 = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    val uniqueNumbers = numbers5.toSet()
    val sortedDescending1 = uniqueNumbers.sortedDescending()
    val groupedByParity = sortedDescending1.groupBy { it % 2 == 0 } //Ключи будут true (четные) и false (нечетные)
    println(groupedByParity)


    //Задание 29: Поиск первого подходящего элемента
    //Напиши функцию, которая принимает список чисел и число и возвращает nullable число.
    //
    //Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60) и число для проверки возраста, например 18.
    //
    //Цель: Найти первый возраст в списке, который соответствует условию (больше второго аргумента) и вернуть его, либо null если значения не нашлось.

    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    val maxNumber2 = ages.maxOrNull()
    println(maxNumber)
    val minNumber2 = ages.minOrNull()
    println(minNumber)










}



