public class NumberSystems {
    public static void main(String[] args) {
        // DECIMAL
        //      210
        int a = 432;

//        System.out.println(4*100 + 3*10 + 2);
//        System.out.println(4*Math.pow(10, 2) + 3*Math.pow(10, 1) + 2*Math.pow(10, 0));

        // OCTAL
        // 10 --> 8
        // long way
//        System.out.println(a / 8); // 54
//        System.out.println(a % 8);          // 0
//
//        System.out.println(54 / 8); // 6
//        System.out.println(54 % 8);         // 6
//
//        System.out.println(6 / 8); // 0
//        System.out.println(6 % 8);          // 6

        // short way
        System.out.println(Integer.toOctalString(a));
//
//        int a8 = 0660;
//
//        // 8 --> 10
//        System.out.println(7*Math.pow(8, 2) + 8*Math.pow(8, 1) + 2*Math.pow(8, 0));
//
        int k8 = 0660;
//        System.out.println(k8);


        // BINARY
        // 10 --> 2
//        System.out.println(a / 2); // 216
//        System.out.println(a % 2);          // 0

//        System.out.println(216 / 2); // 108
//        System.out.println(216 % 2);          // 0

//        System.out.println(108 / 2); // 54
//        System.out.println(108 % 2);          // 0

//        System.out.println(54 / 2); // 27
//        System.out.println(54 % 2);          // 0

//        System.out.println(27 / 2); // 13
//        System.out.println(27 % 2);          // 0

//        System.out.println(13 / 2); // 6
//        System.out.println(13 % 2);          // 0

//        System.out.println(6 / 2); // 3
//        System.out.println(6 % 2);          // 0

//        System.out.println(3 / 2); // 1
//        System.out.println(3 % 2);          // 0

//        System.out.println(1 / 2); // 0
//        System.out.println(1 % 2);          // 0

        // short way
        System.out.println(Integer.toBinaryString(a));

        //         876543210
        int a2 = 0b110110000;
//        System.out.println(a2);
//        System.out.println(1*Math.pow(2, 8) + 1*Math.pow(2, 7) + 0*Math.pow(2, 6) + 1*Math.pow(2, 5) + 1*Math.pow(2, 4) + 0*Math.pow(2, 3) + 0*Math.pow(2, 2) + 0*Math.pow(2, 1) + 0*Math.pow(2, 0));
//
//        // HEX
//        System.out.println(a / 16); // 27
//        System.out.println(a % 16);          // 0
//
//        System.out.println(27 / 16); // 1
//        System.out.println(27 % 16);          // 11
//
//        System.out.println(1 / 16); // 0
//        System.out.println(1 % 16);          // 1

        // short way
        System.out.println(Integer.toHexString(a));

        int a16 = 0x1b0;
//        System.out.println(a16);
//        System.out.println(1*Math.pow(16, 2) + 0xb*Math.pow(16, 1) + 0*Math.pow(16, 0));
    }
}
