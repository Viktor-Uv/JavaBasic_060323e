package cycles;

public class DoWhileExample1 {
    public static void main(String[] args) {
        // indexes 0 1 2 3 4 5 6  7  8
        int[] q = {4,2,6,7,1,3,5,14,15};

        // do-while loop
        int w = 0;
        do {
            System.out.print(q[w] + " ");
            w++;
        } while (w < q.length);

    }
}
