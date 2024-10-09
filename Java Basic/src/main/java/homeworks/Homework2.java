package homeworks;

public class Homework2 {
    public static void main(String[] args) {
        // 1. Перевести 637 из десятичной в двоичную
        int decimal = 637;

        // 10 --> 2
//        System.out.println(decimal / 2); // 318
//        System.out.println(decimal % 2);          // 1
//
//        System.out.println(318 / 2); // 159
//        System.out.println(318 % 2);          // 0
//
//        System.out.println(159 / 2); // 79
//        System.out.println(159 % 2);          // 1
//
//        System.out.println(79 / 2); // 39
//        System.out.println(79 % 2);          // 1
//
//        System.out.println(39 / 2); // 19
//        System.out.println(39 % 2);          // 1
//
//        System.out.println(19 / 2); // 9
//        System.out.println(19 % 2);          // 1
//
//        System.out.println(9 / 2); // 4
//        System.out.println(9 % 2);          // 1
//
//        System.out.println(4 / 2); // 2
//        System.out.println(4 % 2);          // 0
//
//        System.out.println(2 / 2); // 1
//        System.out.println(2 % 2);          // 0
//
//        System.out.println(1 / 2); // 0
//        System.out.println(1 % 2);          // 1

        // indexes:      9876543210
        int decimal2 = 0b1001111101;
        // short way
        System.out.println(Integer.toBinaryString(decimal));

        // 2 --> 10
        System.out.println(1*Math.pow(2, 9) + 0*Math.pow(2, 8) + 0*Math.pow(2, 7) + 1*Math.pow(2, 6) + 1*Math.pow(2, 5) + 1*Math.pow(2, 4) + 1*Math.pow(2, 3) + 1*Math.pow(2, 2) + 0*Math.pow(2, 1) + 1*Math.pow(2, 0));


        /* new line */
        System.out.println();


        // 2. 11100111 перевести из двоичной в десятичную

        // indexes:    76543210
        int binary = 0b11100111;
        System.out.println(1*Math.pow(2, 7) + 1*Math.pow(2, 6) + 1*Math.pow(2, 5) + 0*Math.pow(2, 4) + 0*Math.pow(2, 3) + 1*Math.pow(2, 2) + 1*Math.pow(2, 1) + 1*Math.pow(2, 0));
        // short way
        System.out.println(binary);


        /* new line */
        System.out.println();


        // Advanced: Перевести 637 из десятичной в троичную

        // 10 --> 3
//        System.out.println(decimal / 3); // 212
//        System.out.println(decimal % 3);          // 1
//
//        System.out.println(212 / 3); // 70
//        System.out.println(212 % 3);          // 2
//
//        System.out.println(70 / 3); // 23
//        System.out.println(70 % 3);          // 1
//
//        System.out.println(23 / 3); // 7
//        System.out.println(23 % 3);          // 2
//
//        System.out.println(7 / 3); // 2
//        System.out.println(7 % 3);          // 1
//
//        System.out.println(2 / 3); // 0
//        System.out.println(2 % 3);          // 2

        // indexes:    543210
        int decimal3 = 212121;
        System.out.println(decimal3);

        // 3 --> 10
        System.out.println(2*Math.pow(3, 5) + 1*Math.pow(3, 4) + 2*Math.pow(3, 3) + 1*Math.pow(3, 2) + 2*Math.pow(3, 1) + 1*Math.pow(3, 0));

    }
}
