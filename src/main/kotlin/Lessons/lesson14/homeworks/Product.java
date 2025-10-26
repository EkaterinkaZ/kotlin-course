package lessons.lesson14.homeworks;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static java.sql.DriverManager.println;

public class Product(val name: String, val price: Double, val quantity: Int) {

    //Покупка: продукт. Создайте дата класс для продукта, который будет представлять продукт в магазине.
    // У него должны быть свойства “название”, “цена”, “количество”.

    fun main() {

        val apple = Product("Apple", 0.5, 10)
        println(apple)
}
