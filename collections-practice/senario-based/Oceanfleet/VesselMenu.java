package OceanFleet;

import java.util.List;
import java.util.Scanner;

public class VesselMenu {

    private VesselUtil vesselUtil;
    private Scanner scanner;

    public VesselMenu() {
        vesselUtil = new VesselUtil();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\n--- OceanFleet Menu ---");
            System.out.println("1. Add Vessel");
            System.out.println("2. Search Vessel by ID");
            System.out.println("3. Show High Performance Vessels");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addVessel();
                    break;

                case 2:
                    searchVessel();
                    break;

                case 3:
                    showHighPerformanceVessels();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void addVessel() {
        System.out.println("Enter vessel details (vesselId:vesselName:averageSpeed:vesselType):");
        String input = scanner.nextLine();

        String[] data = input.split(":");

        Vessel vessel = new Vessel(
                data[0],
                data[1],
                Double.parseDouble(data[2]),
                data[3]
        );

        vesselUtil.addVesselPerformance(vessel);
        System.out.println("Vessel added successfully!");
    }

    private void searchVessel() {
        System.out.print("Enter Vessel ID: ");
        String id = scanner.nextLine();

        Vessel vessel = vesselUtil.getVesselById(id);

        if (vessel != null) {
            System.out.println(
                    vessel.getVesselId() + " | " +
                    vessel.getVesselName() + " | " +
                    vessel.getVesselType() + " | " +
                    vessel.getAverageSpeed() + " knots"
            );
        } else {
            System.out.println("Vessel Id " + id + " not found");
        }
    }

    private void showHighPerformanceVessels() {
        List<Vessel> vessels = vesselUtil.getHighPerformanceVessels();

        System.out.println("High performance vessels are:");
        for (Vessel vessel : vessels) {
            System.out.println(
                    vessel.getVesselId() + " | " +
                    vessel.getVesselName() + " | " +
                    vessel.getVesselType() + " | " +
                    vessel.getAverageSpeed() + " knots"
            );
        }
    }
}
