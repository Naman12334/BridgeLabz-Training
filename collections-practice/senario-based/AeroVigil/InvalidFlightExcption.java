package AeroVigil;

public class InvalidFlightExcption extends Exception {

    String FlightNumber;

    public InvalidFlightExcption(String message) {
        super(message);
    }
}
