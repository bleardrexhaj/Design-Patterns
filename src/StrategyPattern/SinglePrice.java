package StrategyPattern;

import java.util.List;

public class SinglePrice implements Model {
    @Override
    public long getRevenue(List<Flight> flights) {
        long totalRevenue = 0;
        for (Flight flight : flights) {
            double flightRevenue = 0;
            int numberOfPassengers = flight.getNumberOfPassengers();
            flightRevenue = (numberOfPassengers * TICKET_PRICE) - PLANE_COST;
            totalRevenue += flightRevenue;
        }
        return totalRevenue;
    }
}
