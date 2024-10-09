package ifelse;

public class Example3 {
    public static void main(String[] args) {
        // Например, если у нас будет хорошая погода то мы поедем за город,
        // при этом если останется время - покатаемся на лошади

        boolean weatherIsGood = false;
        boolean freeTime = true;

        if (weatherIsGood) {
            System.out.println("Едем за город");
            if (freeTime) {
                System.out.println("Катание на лошади");
            }
        }

    }
}
