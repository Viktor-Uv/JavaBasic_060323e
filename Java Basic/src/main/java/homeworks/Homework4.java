package homeworks;

public class Homework4 {
    public static void main(String[] args) {
        // Initial data
        char num_char = '9';

        // 1st algorithm
        int a = Integer.parseInt(String.valueOf(num_char));
        System.out.println("1st algorithm result: " + a);

        // 2nd algorithm
        int b = Character.getNumericValue(num_char);
        System.out.println("2nd algorithm result: " + b);

        // 3rd algorithm
        int offset = '0'; // this is to find offset value of character '0' in ASCII table
        int c = num_char - offset;
        System.out.println("3rd algorithm result: " + c);
    }
}
