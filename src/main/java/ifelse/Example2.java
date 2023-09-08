package ifelse;

public class Example2 {
    public static void main(String[] args) {
        // Например, если у нас будет хорошая погода,
        // то мы поедем кататься на лодке, иначе мы пойдем в ресторан

        boolean goodWeather = true;

        if (goodWeather)
            System.out.println("едем кататься на лодке");
        else
            System.out.println("поход в ресторан");
    }
}
