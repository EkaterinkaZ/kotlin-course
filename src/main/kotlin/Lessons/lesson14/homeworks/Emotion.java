package lessons.lesson14.homeworks;

import static java.sql.DriverManager.println;

public class Emotion {

    //Аспект реальности: эмоция. Создайте класс Emotion, который представляет эмоцию.
    // У него должно быть свойство type (String) и intensity (Int). Добавьте метод express(),
    // который выводит описание эмоции в зависимости от её типа и интенсивности.

    class Emotion(val type: String, val intensity: Int) {
        fun express() {
            println("Feeling $type with intensity level $intensity.")
        }
    }
    fun main() {
        val emotion = Emotion("happiness", 8)
        emotion.express()
    }
}
