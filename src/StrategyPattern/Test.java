package StrategyPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        List<Flight> flights = new ArrayList<>();
        Flight flight1 = new Flight("FA956", 200, 1);
        Flight flight2 = new Flight("UA123", 200, 1);
        Flight flight3 = new Flight("EA174", 200, 1);
        Flight flight4 = new Flight("BG953", 200, 1);

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a model (enter a digit): \n0: Single Price\n1: Two Classes\n2: Multi Classes");
        int modelNum = Integer.parseInt(scanner.nextLine());
        switch (modelNum) {
            case 0:
                context.setModel(new SinglePrice());
                break;
            case 1:
                context.setModel(new TwoClasses());
                break;
            case 2:
                context.setModel(new MultiClasses());
                break;
            default:
                System.out.println("Invalid input!");
                return;
        }

        long totalRevenue = context.executeModel(flights);
        System.out.println("The total revenue for this list of flights is $" + totalRevenue);
    }
}
