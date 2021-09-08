public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 12;
        int b = -17;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Красный");
        }

        if (1 <= value && value <= 100) {
            System.out.println("Желтый");
        }

        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int c = 11;
        int d = 11;
        if (c >= d){
            System.out.println("c >= d");
        }
        else {
            System.out.println("c < d");
        }
    }
}









