package stimmax.lessons.lesson10.homeworks

fun main () {

    //Задачи на работу со словарём
    //1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val emptyMap = mapOf<Int, Int>()
    println(emptyMap)

    //2. Создайте словарь, инициализированный несколькими парами "ключ-значение",
// где ключи - float, а значения - double

    val map = mutableMapOf(1.6f to 1.61002, 3.14f to 3.14159265)
    println(map)

    //3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.

    val mutableCapitals = mutableMapOf("1" to "Москва", "2" to "Париж")
    println(mutableCapitals)

    //4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".

    val newMutableCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")
    newMutableCapitals["Германия"] = "Берлин"
    println(newMutableCapitals)

    //5. Используя словарь из предыдущего задания, извлеките значение, используя ключ.
// Попробуй получить значение с ключом, которого в словаре нет.
    val value = newMutableCapitals["Россия"]
    println(value)

    val newValue = newMutableCapitals["Китай"]
    println(newValue)

    //6. Удалите определенный элемент из изменяемого словаря по его ключу.

    val elementsDictionary = mutableMapOf("РБ" to "Минск", "Польша" to "Варшава")
    elementsDictionary.remove("РБ")
    println(elementsDictionary)

    //7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
// Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val s1 = mutableMapOf(4.8 to 2, 6.3 to 3, 10.5 to 5)

    for ((key, value) in s1) {
        if (value != 0) {
            val result1 = key.toDouble() / value.toInt()
            println("Ключ: $key, Значение: $value, Результат деления: $result1")
        } else {
            println("$key / $value: Деление на ноль невозможно")
        }
    }

    //8. Измените значение для существующего ключа в изменяемом словаре.
    val map2 = mutableMapOf("a" to 1, "b" to 2)
    map2["a"] = 4
    println("Новое значение в изменяемом словаре: $map2")

    //9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val map3 = mutableMapOf("apple" to 10, "banana" to 20)
    val map4 = mutableMapOf("orange" to 30, "grape" to 40)

    // Создаем третий изменяемый словарь
    val mergedMap = mutableMapOf<String, Int>()

    // Объединение map
    for ((key, value) in map3) {
        mergedMap[key] = value
    }

    // Объединение map4
    for ((key, value) in map4) {
        mergedMap[key] = value
    }

    // Вывод объединенного словаря
    println(mergedMap)

    //10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
// Добавьте несколько элементов в этот словарь.

    val myDictionary: MutableMap<String, List<Int>> = mutableMapOf()

    // Добавление элементов
    myDictionary["key1"] = listOf(1, 2, 3)
    myDictionary["key2"] = listOf(10, 20, 30)

    myDictionary["key3"] = listOf(100, 200, 300) //добаляю еще элементы
    println(myDictionary)


    //11. Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
// Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
// Распечатай полученное множество.

    val newDictionary = mutableMapOf<Int, MutableSet<String>>()
    newDictionary[1] = mutableSetOf("Atlas", "Emgrand") //добавляем ключи
    newDictionary[2] = mutableSetOf("Fiesta", "Focus" )

    val setForKey = newDictionary[1] //получение изменяемого множества

    setForKey?.add("X80")
    println(newDictionary)

    //12. Создай словарь, где ключами будут пары чисел. Через перебор найди значение у
// которого пара будет содержать цифру 5 в качестве первого или второго значения.

    val pairs = mutableMapOf(20 to 10, 30 to 50, 60 to 5)

    for ((key, value) in pairs) {
        if (key or value == 5) {
            println("Цифра 5 содержится в качестве  первого значения")
        } else {
            println("Цифра 5 отсутствует в словаре")
        }
        break
    }

    //  Задачи на подбор оптимального типа для словаря
    //1) Словарь библиотека: Ключи - автор книги, значения - список книг
    val booksByAuthor = mapOf(
        "А. С. Пушкин" to listOf("Сказка о царе Салтане", "Евгений Онегин"),
        "Н. Носов" to listOf("Живая шляпа"),
        "Э. Н. Успенский" to listOf("Крокодил Гена и его друзья", "Дядя Фёдор, пёс и кот")
    )
    println(booksByAuthor)

    //2) Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val plants = mapOf("Flowers" to listOf("Rose\n" +
            "Sunflower\n" +
            "Tulip\n" +
            "Daisy\n" +
            "Poppy\n" +
            "Orchid"), "Trees" to listOf("Palm tree\n" +
            "Banana tree"), "Herbs and Vegetables" to listOf("Mint\n" +
            "Spinach"))
    println(plants)

    //3) Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды

    val playOff = mapOf("Manchester United" to listOf("Benjamin Šeško", "Senne Lammens"), "Liverpool" to listOf("Alexander Isak", "Giovanni Leoni",), "Arsenal" to listOf("Viktor Gyökeres\n" +
            "Forward\n" +
            "\n" +
            "Bukayo Saka"))
    println(playOff)

    //4) Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату

    val medicineCourse = mapOf("2025-10-7" to listOf("Аспирин", "Витамин C"),
    "2025-10-8" to listOf("Парацетамол"))
    println(medicineCourse)

    //5) Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val places = mapOf("РБ" to "Минск: Национальная библиотека, Троицкое предместье, Ворота Минска, Минская ратуша", "Франция" to "Париж: Эйфелева башня, Лувр")
    println(places)
}
