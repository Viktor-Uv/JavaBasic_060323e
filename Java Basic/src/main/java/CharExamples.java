public class CharExamples {
    public static void main(String[] args) {
//        char q = 'a';
//        char w = 64;
//        char e = '\u03B2';

//        System.out.println(q);
//        System.out.println(w);
//        System.out.println(e);
//        System.out.println((int) e);

        // Char to int
        /* 1 */
        char q = '@';
        System.out.println(q + " = " + (int) q);

        /* 2 */
        char w = '4';
        int wInt = Integer.parseInt(String.valueOf(w));
        System.out.println(wInt);

        /* 3 */
        int e = Character.getNumericValue(w);


    }
}
