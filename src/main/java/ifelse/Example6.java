package ifelse;

import java.util.Scanner;

public class Example6 {
    // ternary operator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int q = sc.nextInt();
        sc.close();

        System.out.println(getInfoAboutNumber1(q));
        System.out.println(getInfoAboutNumber2(q));
    }

    public static String getInfoAboutNumber1(int input) {

        String result;

        if (input > 0)
            result = "Positive value";
        else if (input < 0)
            result = "Negative value";
        else
            result = "Equals 0";

        return result;
    }

    public static String getInfoAboutNumber2(int input) {
        // variable = Expression1 ? Expression2 : Expression3

        //        условие        блок кода +      блок кода - (новый тернарный оператор)
        return (input > 0) ? "Positive value" : (input < 0) ? "Negative value" : "Equals 0";
    }

}
