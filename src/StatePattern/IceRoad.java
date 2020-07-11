package StatePattern;

public class IceRoad extends Road {
    public IceRoad(Car car) {
        super(car);
    }

    @Override
    public String left() {
        return "1";
    }

    @Override
    public String accel() {
        return "3";
    }

    @Override
    public String right() {
        return "1";
    }

    @Override
    public String brake() {
        return "2";
    }
}
