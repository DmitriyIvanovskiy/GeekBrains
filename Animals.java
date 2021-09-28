abstract class Animals implements IRan, ISwim {
    private int distance;

    public void swim(int distance) {
        this.distance = distance;
    }

    public void ran(int distance) {
        this.distance = distance;
    }
}




