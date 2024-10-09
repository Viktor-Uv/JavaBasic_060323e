package homeworks;

public class Homework1 {
    public static void main(String[] args) {
        // Дано
        int number = 365;

        // Сотни: делим интежер на 100, отбрасывая десятичную часть
        int sotni = number / 100;
        System.out.print("Сотни: ");
        System.out.println(sotni);

        // Десятки: делим на 10, и узнаём второе число через модуло 10
        int desyatki = number / 10;
        desyatki = desyatki % 10;
        System.out.print("Десятки: ");
        System.out.println(desyatki);

        // Единицы: узнаём третье число через модуло 10
        int edinitci = number % 10;
        System.out.print("Единицы: ");
        System.out.println(edinitci);
    }
}
