import java.util.Scanner;

public class BusTracker {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDist = 0;
        int stopDist = 2; 
        String choice = "no";

        while (!choice.equalsIgnoreCase("yes")) {
            totalDist = totalDist + stopDist;

            System.out.println("Bus reached next stop.");
            System.out.println("Total distance covered: " + totalDist + " km");

            System.out.print("Do you want to get off? (yes/no): ");
            choice = sc.next();
        }

        System.out.println("Passenger got off.");
        System.out.println("Final distance traveled: " + totalDist + " km");

        sc.close();
    }
    
}
