/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp.simulatedannealing;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ghost
 */
public class Driver {
    
    private ArrayList<City> initialCities = new ArrayList<>(Arrays.asList(
            new City("Boston", 42.3601, -71.0589),
            new City("Houston", 29.7604, -95.3698),
            new City("Austin", 30.2672, -97.7431),
            new City("San Francisco", 37.7749, -122.4194),
            new City("Denver", 39.7392, -104.9903),
            new City("Los Angeles", 34.0522, -118.2437),
            new City("Chicago", 41.8781, -87.6298),
            new City("New York", 40.7128, -74.0059),
            new City("Dallas", 32.7767, -96.7970),
            new City("Seattle", 47.6062, -122.3321)
    ));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Driver driver = new Driver();
        Route route = new Route(driver.initialCities);
        printHeading(route);
        new SimulatedAnnealing().findRoute(SimulatedAnnealing.INITIAL_TEMPERATURE, route);
        driver.printInfo();
    }
    
    public static void printHeading(Route route){
        String headingColumn1 = "Route";
        String remainingHeadingColumns = "Distance |  Temp  |  Func  |  Random #  |  Decision";
        int cityNamesLength = 0;
        for (int i = 0; i < route.getCities().size(); i++) {
            cityNamesLength += route.getCities().get(i).getName().length();
        }
        int arrayLength = cityNamesLength + route.getCities().size()*2;
        int partialLength = (arrayLength - headingColumn1.length())/2;
        for (int i = 0; i < partialLength; i++) {
            System.out.print(" ");
        }
        System.out.print(headingColumn1);
        for (int i = 0; i < partialLength; i++) {
            System.out.print(" ");
        }
        if ((arrayLength%2) == 0) {
            System.out.print(" ");
        }
        System.out.println(" | " + remainingHeadingColumns);
        cityNamesLength += remainingHeadingColumns.length() + 3;
        for (int i = 0; i < cityNamesLength+route.getCities().size()*2; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
    
    
    public void printInfo(){
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("| Probability function = exp(-(neighborDistance - currentDistance) / temperature) |");
        System.out.println("| newTemperature = oldTemperature * (1-RATE_OF_COOLING)                           |");
        System.out.print("| RATE_OF_COOLING = "+ SimulatedAnnealing.RATE_OF_COOLING);
        System.out.println("                                                         |");
        System.out.println("-----------------------------------------------------------------------------------");
    }
    
}
