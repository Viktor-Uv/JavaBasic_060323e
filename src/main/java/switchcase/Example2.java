package switchcase;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // дни недели - выходные / рабочие дни

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер дня недели [1-7]: ");
        int day = sc.nextInt();
        sc.close();

        // способ 1
//        switch (day) {
//            case 1, 2, 3, 4, 5:
//                System.out.println("Рабочий день");
//                break;
//
//            case 6, 7:
//                System.out.println("Выходной день");
//                break;
//
//            default:
//                System.out.println("Ошибка в днях недели");
//        }

        // способ 2
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Рабочий день");
            case 6, 7          -> System.out.println("Выходной день");
            default            -> System.out.println("Ошибка в днях недели");
        }


    }
}
