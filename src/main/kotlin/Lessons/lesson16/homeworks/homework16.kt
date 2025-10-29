package stimmax.lessons.lesson16.homeworks

import jdk.jfr.internal.LogLevel
import kotlin.math.sqrt


//Животные и Их Звуки
//Базовый класс: Animal с методом makeSound().
//Классы наследники: Dog, Cat, Bird.
//Базовый метод makeSound() в классе Animal выводит "This animal makes no sound."
//Переопределите метод makeSound() в каждом классе-наследнике, чтобы Dog выводил "Bark", Cat - "Meow", Bird - "Tweet". Обогати вывод звуков цветом.
//Создайте список животных List<Animal> и вызовите в цикле метод makeSound()

open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("The dog barks")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("The cat meows.")
    }
}

class Bird : Animal() {
    override fun makeSound() {
        println("The bird tweets")
    }
}

//object Colors {
//    const val RESET = "\u001B[0m"
//    const val BLACK = "\u001B[30m"
//    const val RED = "\u001B[31m"
//    const val GREEN = "\u001B[32m"
//    const val YELLOW = "\u001B[33m"
//    const val BLUE = "\u001B[34m"
//    const val PURPLE = "\u001B[35m"
//    const val CYAN = "\u001B[36m"
//    const val WHITE = "\u001B[37m"
//}

private var area: String = TODO("initialize me")
val Animals = listOf("Cat", "Dog", "Bird")


fun main() {
    val animal: Animal = Cat()
    animal.makeSound()


    // Создание списка фигур
    val shapes: List<Any> = listOf(
        Shape.Circle(5.0),
        Shape.Triangle(4.0, 4.0),
        Shape.Square(2.0, 2.0)
    )

    // Цикл для вывода площади каждой фигуры
    for (shape in shapes) {
        println("Площадь фигуры: ${shape.area()}")
    }
}

//Геометрические Фигуры и Их Площадь
//Абстрактный (базовый) класс: Shape с open методом area().
//Классы наследники: Circle, Square, Triangle.
//Метод area() возвращает 0.0.
//Переопределите метод area() в каждом классе-наследнике для расчета площади соответствующей фигуры.
//Подсказка: каждый класс должен иметь аргументы конструктора, позволяющие вычислить площадь (для круга это радиус, для квадрата это сторона, для треугольника это две стороны и угол между ними)
//Создай набор геометрических фигур и выведи в цикле их площадь

abstract class Shape {
    // Открытый метод, который можно переопределить
    open fun area(): Double {
        return 0.0 // Возвращает значение по умолчанию
    }

    abstract fun getArea(): Double

    class Circle(val radius: Double) : Shape() {
        // Переопределяем абстрактный метод getArea()
        override fun getArea(): Double {
            return Math.PI * radius * radius
        }


        // Переопределяем открытый метод area()
        override fun area(): Double {
            return getArea()
        }
    }


    class Triangle(val width: Double, val length: Double) : Shape() {
        // Переопределяем абстрактный метод getArea()
        override fun getArea(): Double {
            return (width * length * sqrt(3.0)) / 4
        }
    }

    class Square(val side: Double, val side2: Double) {
        // Переопределяем метод для расчета площади
        fun getArea(): Double {
            return side * side2
        }
    }
//Принтер
//Создай абстрактный принтер, который имеет абстрактный метод печати,
// принимающий в качестве аргумента строку.
//Создай классы наследники: лазерный и струйный
//Лазерный принтер должен разбивать фразу на слова по пробелу и выводить
// каждое слово отдельно чёрными буквами на белом фоне (хорошо работает на
// тёмной теме)
//Струйный принтер должен разбивать фразу на слова по пробелу и выводить
// каждое слово отдельно цветными буквами на цветном фоне. Слова должны
// быть разноцветны. Можно сделать список пар с цветом текста и фона и
// проходить циклически по этому списку при выводе текста. Проверить
// работу на длинном тексте

abstract class Printer {
    abstract fun print(text: String)
    }

abstract class LaserPrinter(model: String, val tonerType: String) : Printer(model) {
    abstract val word: Any
    val phrase = "Это строка из нескольких слов"
    val words = phrase.split(" ") // Разбиваем строку на слова по пробелу


abstract class InkjetPrinter(model: String, val colorCount: Int) : Printer(model) {
    fun printDocument(document: String) {
        println("Печать цветного документа (цвет: $colorCount) на струйном принтере $model: $document")
    }

    fun refillInk(model: Any) {
        println("Перезаправка чернил в струйном принтере $model")
    }
}
}

    //Класс “Корзина товаров”: содержит поле словаря из ID товаров и
// их количества.
    //Базовый метод addToCart(itemId) добавляет одну единицу товара к
// уже существующим в корзине.
    //Выполнить перегрузку addToCart который:
    //Принимает два аргумента (itemId и количество amount)
    //Принимает словарь из id и количества и добавляет всё в корзину
    //Принимает список из id (добавляет по одной единице).
    //Учесть, что если товар уже есть в корзине, нужно увеличить его
// количество, если нет - добавить.
    //Попробуй создать корзину и положить в неё товар разными способами,
// потом распечатать корзину в консоль.
    //Переопредели у корзины метод toString для красивого форматирования
// содержимого таблицы, включая итоговое количество артикулов и общее
// количество всего товара в корзине.

    class ShoppingCart {
        private val items = mutableListOf<String>() // Создаем изменяемый список для хранения ID товаров

        fun addToCart(itemId: String) {
            items.add(itemId) // Добавляем itemId в список
            println("Товар с ID '$itemId' добавлен в корзину.")
        }

        fun displayCart() {
            println("Товары в корзине: $items")
        }
    }

//    fun main() {
//        val cart = ShoppingCart()
//        cart.addToCart("item123")
//        cart.addToCart("item456")
//        cart.displayCart()
//    }

    class Basket(val items: List<String>) {

        override fun toString(): String {
            return "Корзина (товары: ${items.joinToString()})"
        }
    }

//Класс “Логгер”: представляет из себя инструмент для вывода информации
// в консоль с разным префиксами уровня логирования (INFO, WARNING, ERROR,
// DEBUG)
//Базовый метод log(message) выводит в консоль сообщение message с
// префиксом INFO
//Выполнить перегрузку метода log, который:
//Принимает уровень логирования и сообщение. Выводит сообщения типа
// WARNING жёлтым цветом, а ERROR белым цветом на красном фоне.
//Принимает список сообщений и все их выводит с уровнем INFO
//Принимает объект типа Exception и выводит его поле message с префиксом
// уровня ERROR
//Попробуй создать логгер и добавить в него сообщения разными способами.
// Проверь вывод в консоли.

    class Logger(private val currentLogLevel: LogLevel) {

        fun debug(message: String) {
            log(LogLevel.DEBUG, message)
        }

        fun info(message: String) {
            log(LogLevel.INFO, message)
        }

        fun warn(message: String) {
            log(LogLevel.WARN, message)
        }

        fun error(message: String) {
            log(LogLevel.ERROR, message)
        }


        private fun log(level: LogLevel, message: String) {
            if (level.ordinal >= currentLogLevel.ordinal) {
                println("[${level}] - $message")
            }
        }
    }

    fun main() {
        // Создаем логгер с уровнем INFO
        val logger = Logger(LogLevel.INFO)


        logger.debug("Это сообщение для отладки") // Не будет выведено
        logger.info("Это информационное сообщение") // Будет выведено
        logger.warn("Это предупреждение") // Будет выведено
        logger.error("Это сообщение об ошибке") // Будет выведено
    }
}




