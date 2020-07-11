package StatePattern;

public class WetRoad extends Road {
    public WetRoad(Car car) {
        super(car);
    }

    @Override
    public String left() {
        return "4";
    }

    @Override
    public String accel() {
        return "9";
    }

    @Override
    public String right() {
        return "4";
    }

    @Override
    public String brake() {
        return "7";
    }

}
