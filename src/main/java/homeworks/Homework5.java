package homeworks;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        // Ask box dimensions
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        int w = sc.nextInt();

        System.out.print("Enter height: ");
        int h = sc.nextInt();

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        // Create new box
        Box box1 = new Box(w, h, l);
    }
}