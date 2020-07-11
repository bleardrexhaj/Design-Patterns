package StatePattern;

public class RegularRoad extends Road {
    public RegularRoad(Car car) {
        super(car);
    }

    @Override
    public String left() {
        return "5";
    }

    @Override
    public String accel() {
        return "9";
    }

    @Override
    public String right() {
        return "5";
    }

    @Override
    public String brake() {
        return "8";
    }


}
