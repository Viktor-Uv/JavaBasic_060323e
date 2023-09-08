package homeworks;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        // Get integer from user
        System.out.print("Enter integer and press ENTER: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Convert to binary and display
        System.out.println("Your number in binary: " + Integer.toBinaryString(number));

        // Close Scanner
        sc.close();
    }
}