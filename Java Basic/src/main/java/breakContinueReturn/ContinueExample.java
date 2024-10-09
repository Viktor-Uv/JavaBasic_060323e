package breakContinueReturn;

public class ContinueExample {
    public static void main(String[] args) {
        int[] w = {4,2,1,6,4,9,11};

        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i] + " ");

            if (w[i] % 2 == 0) {
                System.out.println();
                continue;
            }

            System.out.println("odd number");
        }
    }
}
