package StrategyPattern;

import java.util.List;

public class TwoClasses implements Model {
    @Override
    public long getRevenue(List<Flight> flights) {
        long totalRevenue = 0;
        for (Flight flight : flights) {
            double flightRevenue = 0;
            int numberOfPassengers = flight.getNumberOfPassengers();
            flightRevenue = calculateBusinessClassRevenue(numberOfPassengers) + calculateCoachClassRevenue(numberOfPassengers);
            totalRevenue += flightRevenue;
        }
        return totalRevenue;
    }

    private long calculateBusinessClassRevenue(int numberOfPassengers) {
        return (long) ((0.33 * numberOfPassengers) * (TICKET_PRICE * 1.5) - (PLANE_COST * 1.1));
    }

    private long calculateCoachClassRevenue(int numberOfPassengers) {
        return (long) ((0.67 * numberOfPassengers) * (TICKET_PRICE * 0.75) - PLANE_COST);
    }

}
