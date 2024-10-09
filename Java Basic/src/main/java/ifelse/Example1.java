package ifelse;

public class Example1 {
    public static void main(String[] args) {
        example2();
    }

    public static void example1() {
        boolean freeTime = true;
        if (freeTime) {
            System.out.println("go lunch");
        }
    }

    public static void example2() {
        boolean goodWeather = true;
        if (goodWeather)
            System.out.println("go walk");
        else
            System.out.println("go snack");
    }
    
    
    
}
