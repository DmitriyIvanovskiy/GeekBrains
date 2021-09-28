public class Cat extends Animals {
    private final int distanceRan = 200;
    private final int distanceSwim = 0;

    @Override
    public void ran(int distance) {
        super.ran (distance);
        if (distance >= distanceRan) {
            System.out.println("Кот не может пробежать такую дистанцию");
        } else System.out.println("Кот пробежал " + distance);
    }

    @Override
    public void swim (int distance) {
        super.swim(distance);
        if (distance >= distanceSwim) {
            System.out.println("Кот не может плавать");
        } else System.out.println("Кот проплыл " + distance);
    }
}