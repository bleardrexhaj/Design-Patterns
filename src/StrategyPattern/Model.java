package StrategyPattern;

import java.util.List;

public interface Model {
    long TICKET_PRICE = 300;
    long PLANE_COST = 50000;
    long getRevenue(List<Flight> flights);
}
