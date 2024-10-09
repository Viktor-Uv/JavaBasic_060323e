package operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int q = 10;
        int w = 20;
        int e = 30;
        int r = 40;

        // Example
        //                                  true         true
        //                          false           true
        //                     true     false
        System.out.println((((q<w) && !(e<r)) || !(w>r)) && (q<r));

        // Logic AND (&&) => true
        System.out.println("(q<w) && (e<r): " + ((q<w) && (e<r)));

        // Logic AND (&&) => false
        System.out.println("(q<w) && (e>r): " + ((q<w) && (e>r)));

        // Logic OR (||) => true
        System.out.println("(q<w) || (e>r): " + ((q<w) || (e>r)));

        // Logic OR (||) => false
        System.out.println("(q>w) || (e>r): " + ((q>w) || (e>r)));

        // Logic NOT (!) => true
        System.out.println("!((q>w) || (e>r)): " + !((q>w) || (e>r)));

        // Logic NOT (!) => false
        System.out.println("!((q<w) || (e<r)): " + !((q<w) || (e<r)));
    }
}
