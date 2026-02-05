package AeroVigil;

import java.util.*;
import java.util.regex.*;
import java.util.Scanner;
public class FlightUtil implements IFlight {

    public void EnterFlighDetailsAndValide() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter flight details <FlightNumber>:<FlightName>:<PassengerCount>:<CurrentFuelLevel>");
        String[] input = sc.nextLine().split(":");

        String flightNumber = input[0];
        String flightName = input[1];
        int passengerCount = Integer.parseInt(input[2]);
        double currentFuelLevel = Double.parseDouble(input[3]);

        if (ValidateFlightNumber(flightNumber)
                && ValidateFlightName(flightName)
                && ValidatePassengerCount(passengerCount, flightName)) {

            double requiredFuel = CalculateFuelToFillTank(flightName, currentFuelLevel);
            if (requiredFuel > 0)
                System.out.println("Fuel required to fill the tank: " + requiredFuel + " liters");
        }
    }

    public boolean ValidateFlightNumber(String FlightNumber) {
        try {
            String pattern = "^FL-[1-9][0-9]{3}$";
            boolean isValid = Pattern.matches(pattern, FlightNumber);

            if (!isValid)
                throw new InvalidFlightExcption("The Flight Number <" + FlightNumber + "> Is Invalid");

            return true;
        } catch (InvalidFlightExcption e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean ValidateFlightName(String FlightName) {
        try {
            Set<String> flightNames = new HashSet<>(
                    Arrays.asList("SpiceJet", "Vistara", "IndiGo", "Air Arabia"));

            if (flightNames.contains(FlightName))
                return true;

            throw new InvalidFlightExcption("The Flight Name <" + FlightName + "> Is Invalid");

        } catch (InvalidFlightExcption e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean ValidatePassengerCount(int passengerCount, String flightName) {
        try {
            if (passengerCount <= 0)
                throw new InvalidFlightExcption(
                        "The passenger count <" + passengerCount + "> is invalid for <" + flightName + ">.");

            Map<String, Integer> flightSeatCountMap = new HashMap<>();
            flightSeatCountMap.put("SpiceJet", 396);
            flightSeatCountMap.put("Vistara", 615);
            flightSeatCountMap.put("IndiGo", 230);
            flightSeatCountMap.put("Air Arabia", 130);

            if (passengerCount > flightSeatCountMap.get(flightName))
                throw new InvalidFlightExcption(
                        "The passenger count <" + passengerCount + "> is invalid for <" + flightName + ">.");

            return true;

        } catch (InvalidFlightExcption e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public double CalculateFuelToFillTank(String flightName, double currentFuelLevel) {
        try {
            if (currentFuelLevel <= 0)
                throw new InvalidFlightExcption("Invalid fuel level for <" + flightName + ">.");

            Map<String, Integer> flightFuelCapacityMap = new HashMap<>();
            flightFuelCapacityMap.put("SpiceJet", 200000);
            flightFuelCapacityMap.put("Vistara", 300000);
            flightFuelCapacityMap.put("IndiGo", 250000);
            flightFuelCapacityMap.put("Air Arabia", 150000);

            if (currentFuelLevel > flightFuelCapacityMap.get(flightName))
                throw new InvalidFlightExcption("Invalid fuel level for <" + flightName + ">.");

            return flightFuelCapacityMap.get(flightName) - currentFuelLevel;

        } catch (InvalidFlightExcption e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
