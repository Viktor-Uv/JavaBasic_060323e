package cycles;

public class ForExample1 {
    public static void main(String[] args) {
        example8();
    }

    public static void example1() {

        // самый простой пример
        for (int i = 0; i < 10; i++)
            System.out.println("hello java " + i);
    }

    public static void example2() {
        //Условие инициализации: здесь мы инициализируем используемую переменную для
        // индексирования. Инициализация индекса отмечает начало цикла for.
        //Можно использовать уже объявленную переменную или объявить переменную,
        // только локальную для цикла.

        int i = 0;
        for (; i < 3; i++) {
            System.out.println("hello java " + i);
        }
    }

    public static void example3() {
        // Проверка условия: используется для проверки условия выхода из цикла.
        // Проверка должна возвращать логическое значение. Условие проверяется до
        // выполнения операторов цикла.

        int i = 0;

        // не самый удачный сценарий выноса условия за пределы цикла (так делать не надо)
        boolean condition = i < 3; // true

        for (; i < 3; i++) {
            System.out.println("hello java " + i);
        }

    }

    public static void example4() {
        // Увеличение/уменьшение: используется для обновления переменной для
        // следующей итерации.

        for (int i = 0; i < 10; i += 2) { // i = i + 2 <=> i += 2
            System.out.println("hello java " + i);
        }
    }

    public static void example5() {
        // indexes 0 1 2 3 4
        int[] q = {4,2,6,7,1};

        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i] + " ");
        }

        System.out.println();

        for (int i = q.length - 1; i >= 0; i--) {
            System.out.print(q[i] + " ");
        }

    }

    public static void example6() {

        for (double i = 0; i < 1; i += 0.1) {
            System.out.println(i);
        }
    }

    public static void example7() {

        // fake infinity loop
        for (int i = 1; i >= 1; i += 1000) {
            System.out.println("Infinite Loop " + i);
        }

    }

    public static void example8() {

        // real infinity loop
        for(;;) {
            System.out.println("hello java ");
        }

    }
}
