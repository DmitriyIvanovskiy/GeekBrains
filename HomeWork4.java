/**
 * Java 1. HomeWork 4
 *
 * @author Dmitriy Ivanovskiy
 * @version 20.09.21
 */

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    static int i;
    static int j;
    static int a;

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin1(DOT_X) || checkWin2(DOT_X) || checkWin3(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin1(DOT_O) || checkWin1(DOT_O) || checkWin3(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY; // все поля массива помечаем как пустые
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isCellValid(x, y) != true); // while(isCellValid(x, y) == false)

        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    // проверка победы по столбцам
    public static boolean checkWin1(char symb) {
        for (j = 0; j < SIZE; j++) {
            int a = 0;
            for (i = 0; i < SIZE; i++) {
                if (map[i][j] == symb) {
                    a++;
                } else {
                    a = 0;
                }
                if (a == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    // Проверка победы по строкам
    public static boolean checkWin2(char symb) {
        for (i = 0; i < SIZE; i++) {
            int a = 0;
            for (j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    a++;
                } else {
                    a = 0;
                }
                if (a == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }


    //Проверка победы по диагоналям
    public static boolean checkWin3(char symb) {
        for (int k = 0; k < SIZE; k++) {
            int a = 0;
            int b = 0;
            for (i = k, j = 0; i < SIZE; i++, j++) {
                if (map[i][j] == symb) {
                    a++;
                } else {
                    a = 0;
                }
                if (map[i][SIZE - 1 - j] == symb) {
                    b++;
                } else {
                    b = 0;
                }
                if (a == DOTS_TO_WIN || b == DOTS_TO_WIN) {
                    return true;
                }
            }
            a = 0;
            b = 0;
            for (i = 0, j = k; j < SIZE; i++, j++) {
                if (map[i][j] == symb) {
                    a++;
                } else {
                    a = 0;
                }
                if (map[i][SIZE - 1 - j] == symb) {
                    b++;
                } else {
                    b = 0;
                }
                if (a == DOTS_TO_WIN || b == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    // ничья (поле заполнено)
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}

