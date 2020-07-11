package StrategyPattern;

import java.util.List;

public class Context {
    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    public long executeModel(List<Flight> flights) {
        return model.getRevenue(flights);
    }
}
