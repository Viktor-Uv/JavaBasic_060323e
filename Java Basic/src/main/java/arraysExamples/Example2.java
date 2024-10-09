package arraysExamples;

import java.util.Arrays;
import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        // сгенерируйте массив из 5 элементов случайным образом в диапазоне от [0;10]

        int[] q = new int[5];

        Random r = new Random();

        for (int i = 0; i < q.length; i++) {
            q[i] = r.nextInt(0,11);
        }

        System.out.println(Arrays.toString(q));
    }

    public static void example4() {
        int[] q = {4,3,1,7,9,14,15,20,34,51};
        Arrays.sort(q);
        System.out.println(Arrays.toString(q));
    }

    public static void example3() {
        int[] q = {4,3,1,7,9,14,15,20,34,51};
        int[] qOutput = Arrays.copyOfRange(q, 2,7);
        System.out.println(Arrays.toString(qOutput));
    }

    public static void example2() {
        int[] q = {4,3,1,7,9,14,15,20,34,51};
        int[] qOutput = Arrays.copyOf(q, 4);
        System.out.println(Arrays.toString(qOutput));
    }

    public static void example1() {
        // работа метода clone()
        int[] q = {4,3,1,7,9,14,15,20,34,51};
        int[] w = q.clone();

        System.out.println(Arrays.toString(q));
        System.out.println(Arrays.toString(w));

        w[2] = 1000;

        System.out.println(Arrays.toString(q));
        System.out.println(Arrays.toString(w));
    }
}
