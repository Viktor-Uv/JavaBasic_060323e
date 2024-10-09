package cycles;

public class ForEachExample1 {
    public static void main(String[] args) {
        // indexes 0 1 2 3 4 5 6  7  8
        int[] q = {4,2,6,7,1,3,5,14,15};

        // for-loop
        System.out.print("Result for-loop: ");
        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i] + " ");
        }

        System.out.println();

        // for-each loop
        System.out.print("Result for-each loop: ");
        for (int element : q) {
            System.out.print(element + " ");
        }

    }
}
