package randomArray;

import java.util.Arrays;

// Prints unique numbers from 1 to MAX (including) in a random order
public class RandomNumbers {
    public static void main(String[] args) {
        RandomNumbers list = new RandomNumbers();
        list.generateList(10);
    }
    public void generateList(int items) {
        // Initialisation
        int[] array = new int[items];

        // Assignment
        boolean searching = true;
        while (searching) {
            // Generate random integer
            int random = (int) (1 + Math.random() * items); // [1,items]

            for (int i = 0; i < array.length; i++) {

                // Assign it to a unique place in the array
                if (array[i] == random) {
                    break;
                } else if (array[i] == 0) {
                    array[i] = random;
                    System.out.println(array[i]);

                    // If reached end - exit
                    if (i == items - 1) {
                        searching = false;
                    }
                    break;
                }

            }

        }

    }
}
