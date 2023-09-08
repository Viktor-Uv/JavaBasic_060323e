package arraysExamples;

import homeworks.Box;

public class Example1 {
    public static void main(String[] args) {
        // Creating arrays

        // 1
        int[] q; // declaration
        q = new int[3]; // allocation

        // 2
        float[] w = new float[2]; // initialisation with values
        w[0] = 3.14F;
        w[1] = 4.4F;

        // 3
        byte[] e = {4,3,1,6,7};
        // indexes  0 1 2 3 4

        // 4
        double[] r = new double[]{1.5, 1.75, 3.3, 2.41};

        // create array of objects
        Box[] t = new Box[2];
        t[0] = new Box(10,20,30);
        t[1] = new Box(1, 2, 3);

        for (int i = 0; i < t.length; i++) {
            t[i].printVolume();
        }

        // create array of objects in one line
        Box[] y = {new Box(10,20,30), new Box(1,2,3)};
    }
}
