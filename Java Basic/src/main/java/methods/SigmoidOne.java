package methods;

public class SigmoidOne {
    // examples with methods type void

    double result1, result2, result3, result4;


    public SigmoidOne(double x) {
        neg(x);
        pow();
        sum();
        div();

        printResult();
    }

    private void neg(double x) {
        result1 = -1 * x;
    }

    private void pow() {
        result2 = Math.pow(Math.E, result1);
    }

    private void sum() {
        result3 = 1 + result2;
    }

    private void div() {
        result4 = 1 / result3;
    }

    private void printResult () {
        System.out.println("SOne = " + result4);
    }

}
