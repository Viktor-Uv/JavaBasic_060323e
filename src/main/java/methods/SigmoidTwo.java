package methods;

public class SigmoidTwo {


    public SigmoidTwo(double x) {
//        double result1 = neg(x);
//        double result2 = pow(result1);
//        double result3 = sum(result2);
//        double result4 = div(result3);

        double result4 = div(sum(pow(neg(x))));

        printResult(result4);
    }

    private double neg(double x) {
        return x * (-1);
    }

    private double pow(double q) {
        return Math.pow(Math.E, q);
    }

    private double sum(double w) {
        return 1 + w;
    }

    private double div(double e) {
        return 1 / e;
    }

    private void printResult(double r) {
        System.out.println("STwo = " + r);
    }




//    public void test1() {
//        int a = 2* 3;
//        System.out.println(a);
//    }
//
//    public double test2() {
//        double a = 2* 3;
//        System.out.println(a);
//
//        return a;
//    }
}
