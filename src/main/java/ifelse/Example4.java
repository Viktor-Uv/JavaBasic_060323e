package ifelse;

public class Example4 {
    public static void main(String[] args) {
        // Например, если будет плохая погода - останемся дома, будем смотреть фильм.
        // Иначе если погода будет просто отличная - купим билеты и
        // уедем в другой город на ярмарку.
        // Но если погода будет неопределенная, тогда встретимся с друзьями в нашем доме.

        String weatherType = "good"; // good/bad/undefined

        // классический подход
//        if (weatherType.equals("bad")) {
//            System.out.println("останемся дома, будем смотреть фильм");
//        } else {
//            if (weatherType.equals("good")) {
//                System.out.println("купим билеты и уедем в другой город на ярмарку");
//            } else {
//                System.out.println("встретимся с друзьями в нашем доме");
//            }
//        }

        // if-else-if ladder
        if (weatherType.equals("bad")) {
            System.out.println("останемся дома, будем смотреть фильм");
        } else if (weatherType.equals("good")) {
            System.out.println("купим билеты и уедем в другой город на ярмарку");
        } else {
            System.out.println("встретимся с друзьями в нашем доме");
        }

    }
}