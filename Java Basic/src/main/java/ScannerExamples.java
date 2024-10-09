import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer: ");
        int a = sc.nextInt();
        System.out.println("Entered number: " + a);

        System.out.print("Ist das Wetter gut? ");
        boolean b = sc.nextBoolean();
        System.out.println("You entered: " + b);

        System.out.print("Enter float: ");
        double c = sc.nextDouble();
        System.out.println("Multiplied by 10: " + c * 10);

        System.out.println("");

        sc.close();
    }
}