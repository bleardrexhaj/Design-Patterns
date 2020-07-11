package StrategyPattern;

import java.util.List;

public class MultiClasses implements Model {
    @Override
    public long getRevenue(List<Flight> flights) {
        long totalRevenue = 0;
        for (Flight flight : flights) {
            double flightRevenue = 0;
            int numberOfPassengers = flight.getNumberOfPassengers();
            flightRevenue = calculateFirstClassRevenue(numberOfPassengers) + calculateBusinessClassRevenue(numberOfPassengers) + calculateCoachClassRevenue(numberOfPassengers);
            totalRevenue += flightRevenue;
        }
        return totalRevenue;
    }

    private long calculateFirstClassRevenue(int numberOfPassengers) {
        return (long) ((0.1 * numberOfPassengers) * (TICKET_PRICE * 4) - (PLANE_COST * 1.2));
    }

    private long calculateBusinessClassRevenue(int numberOfPassengers) {
        return (long) ((0.2 * numberOfPassengers) * (TICKET_PRICE * 1.5) - (PLANE_COST * 1.2));
    }

    private long calculateCoachClassRevenue(int numberOfPassengers) {
        return (long) ((0.7 * numberOfPassengers) * (TICKET_PRICE * 0.75) - PLANE_COST);
    }
}
