import com.auto.germany.Car;

public class Second {
    public static void main(String[] args) {
        Car car1 = new Car(1200, 2023, "bmw");
        System.out.println(car1.year + " " + car1.weight + " " + car1.model);

        Car car2 = new Car(1100, 2020);
        System.out.println(car2.year + " " + car2.weight + " " + car2.model);

        Car car3 = new Car(1000);
        System.out.println(car3.year + " " + car3.weight + " " + car3.model);

        Car car4 = new Car();
        System.out.println(car4.year + " " + car4.weight + " " + car4.model);
    }
}
