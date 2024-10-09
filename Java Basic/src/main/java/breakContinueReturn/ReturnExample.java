package breakContinueReturn;

public class ReturnExample {
    public static void main(String[] args) {
        // indexes 0 1 2 3 4 5  6
        int[] w = {4,2,1,6,4,9,11};

        for (int i = 0; i < w.length; i++) {

            System.out.println(w[i]);

            if (w[i] == 1)
                return;

        }

        System.out.println("End of file");
    }
}
