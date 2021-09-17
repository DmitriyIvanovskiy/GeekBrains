public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println (between10And20 (5, 12));
        System.out.println (between10And20 (1, 8));
        System.out.println (between10And20 (33, 25));
        System.out.println (between10And20 (5, 5));
        System.out.println (between10And20 (10, 10));

        System.out.println (positiveOrNegative (33));
        System.out.println (positiveOrNegative (-3));
        System.out.println (positiveOrNegative (0));

        System.out.println (trueOrFalse (-3));
        System.out.println (trueOrFalse (7));
        System.out.println (trueOrFalse (0));

        printLineNTimes (1);

        leapYear(100);
    }

    static String between10And20(int a, int b) {
        return a + b > 10 && a + b < 20 ? "true" : "false";
    }

    static String positiveOrNegative(int a) {
        return a >= 0 ? "Положительное" : "Отрицательное";
    }

    static String trueOrFalse(int a) {
        return a >= 0 ? "false" : "true";
    }

    static void printLineNTimes(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Напечатаем это n раз");
        }
    }

    /*
     *** Вычисление високостного года ***
     */
    static void leapYear(int y) {
        int a = y % 4;
        int b = y % 100;
        int c = y % 400;

        if (c == 0) {
            System.out.println("true");
        } else {
            if (a == 0 && b != 0) {
                System.out.println("true");
            }
        }
        if (a != 0) {
            System.out.println("false");
        }
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("false");
        }
    }
}






