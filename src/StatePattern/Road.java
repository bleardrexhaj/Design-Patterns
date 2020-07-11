package StatePattern;

public abstract class Road {
    Car car;

    public Road(Car car) {
        this.car = car;
    }

    public abstract String left();

    public abstract String accel();

    public abstract String right();

    public abstract String brake();

}
