package tests;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // Read user's input
        System.out.print("Enter string: ");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        scanner.close();

        // Count words
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ')
                count++; // Count every space as the end of the word
        }
        // If not empty string entered, include word at the end of the sentence (not followed by space)
        if (!message.equals(""))
            count++;

        // Display word count
        System.out.println("Words entered: " + count);
    }
}
