package operators;

public class RelationOperator {
    public static void main(String[] args) {
        int q = 10;
        int w = 20;
        System.out.println("q = " + q + ", w = " + w);

        boolean qw = q == w;

        System.out.println("q == w: " + (q == w));
        System.out.println("q != w: " + (q != w));
        System.out.println("q < w: " + (q < w));
        System.out.println("q > w: " + (q > w));
        System.out.println("q <= w: " + (q <= w));
        System.out.println("q >= w: " + (q >= w));
    }
}
