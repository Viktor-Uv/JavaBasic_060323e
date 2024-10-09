import java.util.Scanner;

public class ScannerExamples2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.next();
        System.out.println("You entered: " + word);

        sc.nextLine();

        System.out.print("Enter line: ");
        String line = sc.nextLine();
        System.out.println("You entered: " + line);

        System.out.println("Symbol from line: " + line.charAt(0));

        sc.close();

    }
}