package StatePattern;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        UI ui = new UI(car);
        ui.init();
    }
}
