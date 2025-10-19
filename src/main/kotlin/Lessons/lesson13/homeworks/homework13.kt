package stimmax.lessons.lesson13.homeworks

import kotlin.collections.List

//1) Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.

private fun Map<String, String>.remove(string: String) {}

fun main() {
    val automationTest = mapOf(1 to 23, 2 to 21, 3 to 24, 4 to 25, 5 to 35)
    val averageKeys = automationTest.keys.average()
    println(averageKeys)

//2) Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а
// значения - строка с метаданными. Выведите список всех тестовых методов.

    val metaTest = mapOf("test1" to "one", "test2" to "two", "test3" to "three")
    val listOfMethods = metaTest.keys.toList()

    println(listOfMethods)


//3) В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.

    val mutableResult = metaTest.toMutableMap()
    mutableResult["test4"] = "five"
    println(mutableResult)

//4) Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed,
// failed, skipped).

    val resultTest = mapOf("registration" to "passed", "search" to "failed", "cards" to "skipped", "profile" to "fixed")
    val successTest = resultTest.count { it.value == "passed" }

    println("Количество успешных тестов: $successTest")

//5) Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен
// (ключ - название, значение - статус исправления).

    resultTest.remove("Fixed")
    println(resultTest)


//6) Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
// выведите сообщение о странице и статусе её проверки.

    val webTesting = mapOf("URL1" to "code 200", "URL2" to "code 502", "URL3" to "code 204")
    webTesting.forEach { (key, value) ->
        println("$key contains $value")
    }

//7) Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых
// превышает заданный порог.

    webTesting.forEach {
        println("${it.key} costs ${it.value > "code 300"}")
    }

//8) В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.

    val apiTesting = mapOf("information" to "100", "Success" to "200", "Redirection" to "300", "Client Error" to "400")

    if ((apiTesting.containsKey("Server"))) {
        println("Endpoint was checked")
    }

//9) Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение -
// сама конфигурация), получите значение для "browserType". Ответ не может быть null.

    val configurationTest = mapOf("browserType" to "asdf", "browser" to "config")
    val gettingValue = configurationTest.getValue("browserType")
    println(gettingValue)

//10) Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.

    val myImmutableMaps = mapOf("version1" to "value1", "version" to "value2")
    val mutableMapCopy = myImmutableMaps.toMap()
    val mutableMapCopy2 = mutableMapCopy + Pair("version3", "value3")
    println(mutableMapCopy2)

//11) Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства,
// значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.

    val settingsOrDefault = mutableMapCopy2.getOrDefault("version4", 0.0)
    println(settingsOrDefault)

//12) Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки)
// определенный код ошибки.

    val error = mapOf("Code100" to "information", "Code204" to "client", "Code300" to "Redirect")

    if (error.containsKey("Code100")){
        println("Код ошибки найден")
    }


//13) Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
// а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив
// только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится
// требуемая версия.

    val myMapIdentify = mapOf("TestID1_Version" to "Passed", "TestID2_Version" to "Failed", "TestID3_Version" to "Skipped")
    val filteredOne = myMapIdentify.filter { it.key == "TestID1_Version" }
    println(filteredOne)

//14) У вас есть словарь, где ключи — это названия функциональных модулей приложения, а
// значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.

    val filteredByValues = myMapIdentify.filterValues { it == "Failed"}
    println(filteredByValues)

//15) Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.

    val map3 = mutableMapOf("a" to 1, "b" to 2)
    val map4 = mutableMapOf("c" to 3, "d" to 4)

    map3.putAll(map4)

    println(map3)

//16) Объедините два неизменяемых словаря с данными о багах.

    val map1 = mapOf("bug1" to "blocker", "bug2" to "P1")
    val map2 = mapOf("bug2" to "P2", "bug3" to "P3")
    val mergedMap = map1 + map2
    println(mergedMap)

//17) Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.

    val mutableTemporary = mutableMapOf("Iteration1" to "passed", "Iteration2" to "passed", "Iteration3" to "failed", "Iteration4" to "skipped")

    mutableTemporary.clear()
    println(mutableTemporary)

//18) Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены
// (имеют статус “skipped”). Ключи - название теста, значения - статус.

    val mutableTemporary2 = mutableMapOf("Iteration1" to "passed", "Iteration2" to "passed", "Iteration3" to "failed", "Iteration4" to "skipped")

    mutableTemporary2.remove("Iteration4")
    println(mutableTemporary2)

//19) Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.

    mutableTemporary2.remove("Iteration3")
    val copiedMap = mutableTemporary2.toMap()

    println(copiedMap)

//20) Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста,
// значение — результат) в список строк формата "Test ID: результат".

    val stringList = myMapIdentify.map { (key, value) -> "$key: $value" }
    println(stringList)

//21) Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.

    val immutableMap =  mutableTemporary2.toMap()
    println(immutableMap)

//22) Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив
// идентификаторы тестов на их строковый аналог (например через toString()).

    val testContainData = mutableMapOf("ID1" to 1345, "ID2" to 3424, "ID3" to 3421, "ID4" to 423)

    val stringRepresentation = testContainData.entries.joinToString(
        prefix = "{",
        postfix = "}",
        separator = ", "
    ) { "${it.key}=${it.value}" }
    println(stringRepresentation)

//23) Для словаря с оценками производительности различных версий приложения (ключи - строковая версия,
// значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые
// условия тестирования.

    val pricePerformance = mapOf("Performance1" to 22.33, "Performance2" to 42.37, "Performance3" to 21.21)
    val increasedPrices = pricePerformance.mapValues { it.value * 1.1 }
    println(pricePerformance)

//24) Проверьте, пуст ли словарь с ошибками компиляции тестов.

    val emptyMap = mapOf<String, String>()

    if (emptyMap.isNotEmpty()) {
        println("Словарь emptyMap не пуст")
    } else {
        println("Словарь emptyMap пуст") // Эта строка будет выведена
    }

//25) Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.

    if (pricePerformance.isNotEmpty()) {
        println("Словарь myMap не пуст") // Эта строка будет выведена
    }

//26) Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.

    val areAllPassed = mutableTemporary2.all { it.value == "passed" }
    println(areAllPassed)

//27) Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.

    val containsValue = mutableTemporary2.containsValue("failed")
    println(containsValue)

//28) Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые
// не прошли успешно и содержат в названии “optional”.

    val resultsTest = mapOf("Service1" to "passed", "Service2" to "failed", "Service3" to "optional", "Service4" to "passed")
    val filteredResult = resultsTest.filter { it.value == "optional" }
    println(filteredResult)





}


