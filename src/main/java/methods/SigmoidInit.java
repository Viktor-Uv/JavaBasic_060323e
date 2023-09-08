package methods;

public class SigmoidInit {
    public static void main(String[] args) {
        // S(x) = 1 / (1 + e^(-x))

        double x = 5;

        SigmoidOne sigmoidOne = new SigmoidOne(x);

        SigmoidTwo sigmoidTwo = new SigmoidTwo(x);

        System.out.println("Test = " + (1 / (1 + Math.pow(Math.E, (-1 * x)))));

    }
}
