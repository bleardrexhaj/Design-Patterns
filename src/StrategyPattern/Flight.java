package StrategyPattern;

public class Flight {
    private String flightNumber;
    private int numberOfPassengers;
    private int airlineId;

    public Flight(String flightNumber, int numberOfPassengers, int airlineId) {
        this.flightNumber = flightNumber;
        this.numberOfPassengers = numberOfPassengers;
        this.airlineId = airlineId;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

}
