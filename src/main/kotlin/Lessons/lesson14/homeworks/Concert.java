package lessons.lesson14.homeworks;

import static java.sql.DriverManager.println;

public class Concert(val band: String, val location: String, val cost: Int, val capacity: Int) {

    //Мероприятие: концерт. Создайте класс, который будет представлять концерт. У него должны быть свойства
    // “группа”, “место проведения”, “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”.
    // Добавьте метод, который выводит информацию о концерте и метод “купить билет”, который увеличивает
    // количество проданных билетов на один.

        private var ticketSold = 0

        fun buyTicket() {
            if (ticketSold < capacity) {
                ticketSold++
            }
        }

        fun printDetails() {
            println("Концерт группы $band в $location. Стоимость билета $cost. Осталось ${capacity - ticketSold} мест")
        }
    }
    fun main() {
        val concert = Concert("The Beatles", "Madison Square Garden", 5000, 1000)
        concert.printDetails()
        concert.buyTicket()
        concert.printDetails()
    }

