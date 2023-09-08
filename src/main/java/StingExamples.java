public class StingExamples {
    public static void main(String[] args) {
//        // Create variable as literals (without 'new')
//        String a = "hello";
//        String b = "hello";
//
//        // compare via == & .equals()
//
//        System.out.println("a == b " + (a == b));
//        System.out.println("a.equals(b) " + a.equals(b));
//
//        // not literals
//        String c = new String("hello");
//        String d = new String("hello");
//
//        System.out.println("c == d " + (c == d));
//        System.out.println("c.equals(d) " + c.equals(d));

        // indexes  0123456789012
        String q = "Hello, world!";

        // string length
        System.out.println("length of str = " + q.length());

        // example .charAt()
        char w = q.charAt(3);
        System.out.println("result of charAt() method = " + w);

        // example .substring() - diapason inside string
        String e = q.substring(4);
        System.out.println(e);
        System.out.println(q.substring(3,9));
        System.out.println(q.toLowerCase());
        System.out.println(q.toUpperCase());



    }
}
