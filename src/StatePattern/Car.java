package StatePattern;

public class Car {
    private Road road;

    public Car() {
        this.road = new RegularRoad(this);
    }

    public void changeRoad(Road road) {
        this.road = road;
    }

    public Road getRoad() {
        return road;
    }
}
