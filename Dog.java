public class Dog extends Animals {
    private final int distanceRan = 500;
    private final int distanceSwim = 10;

    @Override
    public void ran(int distance) {
        if (distance >= distanceRan) {
            System.out.println("Собака не сможет пробежать такую дистанцию");
        } else System.out.println("Собака пробежала " + distance);
    }

    @Override
    public void swim (int distance) {
        if (distance >= distanceSwim) {
            System.out.println("Собака не может проплыть такую дистанцию");
        } else System.out.println("Собака проплыла " + distance);
    }
}