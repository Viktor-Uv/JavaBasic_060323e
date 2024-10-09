package tests;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        // Initialise
        int[] array = new int[8];
        Random rand = new Random();

        // Fill with data
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(1,11); // [1;10]
        System.out.println(Arrays.toString(array));

        // Swap odd-indexed elements
        for (int i = 1; i < array.length; i += 2)
            array[i] = 0;
        System.out.println(Arrays.toString(array));
    }
}
