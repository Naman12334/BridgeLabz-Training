package AeroVigil;

import java.util.Scanner;

public class UserIterface {

    private IFlight utility;

    public UserIterface() {
        utility = new FlightUtil();
    }

    public void UserMenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== Aero Vigil =======");
            System.out.println("1. Enter Flight Details");
            System.out.println("2. Exit");
            System.out.print("Enter Choice: ");

            int ch = Integer.parseInt(sc.nextLine());

            switch (ch) {
                case 1:
                    utility.EnterFlighDetailsAndValide();
                    break;
                case 2:
                    return;
                default:
                    break;
            }
        }
    }
}
