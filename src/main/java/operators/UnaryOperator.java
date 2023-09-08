package operators;

public class UnaryOperator {
    public static void main(String[] args) {
        example4();
    }
    public static void example1() {
        // Examples prefix
        int q = 10;
        ++q;
        --q;
    }

    public static void example2() {
        // Examples prefix
        int q = 10;
        System.out.println(q);
        System.out.println(++q);
        System.out.println(--q);
    }

    public static void example3() {
        // Examples postfix
        int q = 10;
        System.out.println(q);
        q++;
        System.out.println(q);
        q--;
        System.out.println(q);
    }

    public static void example4() {
        // Examples postfix
        int q = 10;
        System.out.println(q);
        System.out.println(q++);
        System.out.println(q--);
    }
}
