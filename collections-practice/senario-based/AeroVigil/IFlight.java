package AeroVigil;

interface IFlight {

    void EnterFlighDetailsAndValide();

    boolean ValidateFlightNumber(String FlightNumber);

    boolean ValidateFlightName(String FlightName);

    boolean ValidatePassengerCount(int passengerCount, String flightName);

    double CalculateFuelToFillTank(String flightName, double currentFuelLevel);
}
