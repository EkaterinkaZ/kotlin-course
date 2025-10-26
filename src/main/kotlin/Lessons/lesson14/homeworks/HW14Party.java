package lessons.lesson14.homeworks;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static java.sql.DriverManager.println;

public class HW14Party {
    //Событие: вечеринка. Создайте класс Party, который описывает вечеринку.
    // У него должны быть свойства location (String) и attendees (Int). Добавьте метод details(),
    // который выводит информацию о месте проведения и количестве гостей.

    class Party(val location: String, val attendees: Int) {
        fun details() {
            println("The party is at $location with $attendees attendees.")
        }
    }
    void main() {
        val party;
        party = new Party("City", 20);
        party.details()
    }
}
