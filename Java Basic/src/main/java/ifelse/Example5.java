package ifelse;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        // видоизмененный код из Example4

        // Например, если будет плохая погода - останемся дома, будем смотреть фильм.
        // Иначе если погода будет просто отличная - купим билеты и
        // уедем в другой город на ярмарку.
        // Но если погода будет неопределенная, тогда встретимся с друзьями в нашем доме.

        Scanner sc = new Scanner(System.in);
        // возможные варианты good/bad/undefined
        System.out.print("Введите погоду за окном числом (1 = good/ -1 = bad/ 0 = undefined): ");
        int line = sc.nextInt();
        sc.close();

        if (line == -1)
            System.out.println("останемся дома, будем смотреть фильм");
        else if (line == 1)
            System.out.println("купим билеты и уедем в другой город на ярмарку.");
        else
            System.out.println("встретимся с друзьями в нашем доме");
    }
}