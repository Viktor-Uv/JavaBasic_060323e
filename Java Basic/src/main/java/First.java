import com.auto.finland.Car;

public class First {
    public static void main(String[] args) {

        Car q = new Car();
        System.out.println(q.weigh);
        System.out.println(q.year);
        System.out.println(q.model);
        System.out.println(Car.modelBirthdate);

        System.out.println();
        Car.modelBirthdate = 2010;

        Car w = new Car();
        w.model = "BMW";
        System.out.println(w.weigh);
        System.out.println(w.year);
        System.out.println(w.model);
        System.out.println(Car.modelBirthdate);

        System.out.println();

        w.printWeather();

    }
}
