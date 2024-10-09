package switchcase;

public class Example1 {
    public static void main(String[] args) {
        // Введите погоду за окном числом (1 = good/ -1 = bad/ 0 = undefined): "

        int weather = 1;

        switch (weather) {
            case -1:
                System.out.println("Плохая погода");
                break;

            case 0:
                System.out.println("Неопределенная погода");
                break;

            case 1:
                System.out.println("Хорошая погода");
                break;

            default:
                System.out.println("Введенное значение неверное");
        }


    }
}
