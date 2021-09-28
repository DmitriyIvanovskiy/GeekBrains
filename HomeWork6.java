/**
 * Java 1. HomeWork 6
 *
 * @author Dmitriy Ivanovskiy
 * @version 28.09.21
 */

public class HomeWork6 {
    public static void main (String[] args) {
        int distance = 11;

        Cat cat = new Cat ();
        Dog dog = new Dog ();

        Animals [] arr = new Animals[2];
        arr [0] = cat;
        arr [1] = dog;
        for (Animals animal : arr) {
            animal.ran(distance);
            animal.swim(distance);
        }
    }
}