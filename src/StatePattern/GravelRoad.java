package StatePattern;

public class GravelRoad extends Road {
    public GravelRoad(Car car) {
        super(car);
    }

    @Override
    public String left() {
        return "3";
    }

    @Override
    public String accel() {
        return "7";
    }

    @Override
    public String right() {
        return "3";
    }

    @Override
    public String brake() {
        return "6";
    }

}
