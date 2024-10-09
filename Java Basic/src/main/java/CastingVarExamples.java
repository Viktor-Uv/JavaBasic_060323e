public class CastingVarExamples {
    public static void main(String[] args) {
        byte q = 10;
        int w = 202;
        long e = 1021;

        float r = 3.14F;
        double t = 2.71;

        // Extension, Byte -> Short -> Int -> Long -> Float -> Double
        short y = q;
        double u = q;
        double i = e;
        double o = r;

        // Reduction, Double -> Float -> Long -> Int -> -> Short -> Byte
        int p = (int) t;
        double a = 2.99;
        int s = (int) a;
        byte d = (byte) e;

        //System.out.println(2 + c*c / 3);


    }
}