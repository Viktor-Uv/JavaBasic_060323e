package randoms;

import java.util.Random;

public class RandomExamples {
    public static void main(String[] args) {
        // Generate pseudo random number, class Random
        Random random = new Random(7);

        int q = random.nextInt(0, 10); // [0;10)
        int w = random.nextInt(4, 7); // [4;7)

        double e = random.nextDouble(); // [0;1)


        // Generate pseudo random number, class Math
        double r = Math.random(); // [0;1)

        //     [0;1) * 10      => [0;10)
        //     [0;1) * 7       => [0;7)
        // 4 + [0;1)           => [4;5)
        // 4 + [0;1) * (7 - 4) => [4;7)
        System.out.println(4 + Math.random() * (7 - 4));
    }
}
