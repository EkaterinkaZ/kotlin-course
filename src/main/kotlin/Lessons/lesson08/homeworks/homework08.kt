package stimmax.lessons.lesson08.homeworks

//Если фраза содержит слово "невозможно":
//Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
fun main() {
    val originalString = "Это невозможно выполнить за один день"
    val newString = originalString.replace("невозможно", buildString {
        append("совершенно точно возможно, ")
        append("просто требует времени")


    })
    println(newString)
    println(fullName)
    println(newWord)
    println(newPhrase)
    println(newSentence)
    println(finalString)
    println(maskData)
    println(newEmail)
    println(subString)
    println(total)

}

//Если фраза начинается с "Я не уверен":
//Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".

    val firstName = "Я не уверен в успехе этого проекта"
    val lastName = ", но моя интуиция говорит об обратном"
    val fullName = "$firstName $lastName"

//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное событие".
    val originalWord = "Произошла катастрофа на сервере"
    val newWord = originalWord.replace("а катастрофа", buildString {
        append("о интересное событие")
    })


//Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".

    val originalPhrase = "Этот код работает без проблем"
    val newPhrase = originalPhrase.replace("без проблем", buildString {
        append("с парой интересных вызовов на пути")
    })
//Если фраза содержит только одно слово:
//Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".

    val newAddition = "Удача"
    val firstWord = "Иногда"
    val lastWord = ", но не всегда"
    val newSentence = "$newAddition $firstWord $lastWord"

//2. Извлечение даты из строки лога
//У вас есть строка лога, например "Пользователь вошел в систему -> 2021-12-01 09:48:23"
// (данные могут быть любыми, но формат всегда такой). Извлеките отдельно дату и время из этой
// строки и сразу распечатай их по очереди. Используй indexOf или split для получения правой части сообщения.

    val stringLong = "2021-12-01 09:48:23"
    val parts = stringLong.split(" ")
    val dateOnly = parts[0]
    val timeOnly = parts[1]

    val finalString = "Дата $dateOnly\nВремя: $timeOnly"


//3. Маскирование личных данных
//Дана строка с номером кредитной карты, например "4539 1488 0343 6467".
// Замаскируйте все цифры, кроме последних четырех, символами "*".

    val creditCard = "4539 1488 0343 6467"
    val maskData = creditCard.replace("4539 1488 0343", "************")


//4. Форматирование адреса электронной почты.
//У вас есть электронный адрес, например "username@example.com". Преобразуйте его в строку "username
// [at] example [dot] com", используя функцию replace()
    val email = "username@example.com"
    val newEmail = email.replace("username@example.com", "username [at] example [dot] com")


//5. Извлечение имени файла из пути.
//Дан путь к файлу, например "C:/Пользователи/Документы/report.txt" или "D:/good.themes/dracula.theme"
// (может быть любым). Извлеките название файла с расширением.
    val fileName= "C:/Пользователи/Документы/report.txt"
    val subString = fileName.substring(26)

//6. Создание аббревиатуры из фразы.
//У вас есть фраза, например "Котлин лучший язык программирования" (может быть любой с разделителями слов
// - пробел). Создайте аббревиатуру из начальных букв слов (например, "ООП").
//
//Используйте split. Используйте for для перебора слов. Используйте var переменную для накопления первых букв.
    val myString = "Котлин лучший язык программирования"
    val firstLetter = myString.take(1 )
    val secondLetter = myString.take(8 )
    val threeLetter = myString.take(15 )
    val forthLetter = myString.take(20)
    val total = "$firstLetter$secondLetter$threeLetter$forthLetter"






