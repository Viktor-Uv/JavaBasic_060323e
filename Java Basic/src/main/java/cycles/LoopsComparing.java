package cycles;

public class LoopsComparing {
    public static void main(String[] args) {
        // indexes 0 1 2 3 4 5 6  7  8
        int[] q = {4,2,6,7,1,3,5,14,15};

        // for-loop
        for (int i = 0; i < q.length; i++)
            System.out.print(q[i] + " ");

        System.out.println();

        // while-loop
        int i = 0;
        while (i < q.length) {
            System.out.print(q[i] + " ");
            i++;
        }

        System.out.println();

        // do-while loop
        int j = 0;
        if (j < q.length) {
            do {
                System.out.print(q[j] + " ");
                j++;
            } while (j < q.length);
        }


    }
}
