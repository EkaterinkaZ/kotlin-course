package lessons.lesson14.homeworks;

import static java.sql.DriverManager.println;

public class Moon {

    //Природное явление: луна. Создайте объект Moon, который будет представлять Луну.
    // Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент,
    // и phase (String), чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon").
    // Добавьте метод showPhase(), который выводит текущую фазу Луны.

    object Moon
    private final boolean Boolean;

    {
        boolean isVisible: Boolean = true
        val phase: String = "Full Moon"
        fun showPhase() {
            if (isVisible) {
                println("The moon is visible, and it's currently a $phase.")
            } else {
                println("The moon is not visible right now.")
            }
        }
    }
    fun main() {
        Moon.showPhase()
}
