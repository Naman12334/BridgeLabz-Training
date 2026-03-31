import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 200.0;
        double fare;
        int distance;

        while (balance > 0) {

            System.out.print("Enter distance in km (0 to quit): ");
            distance = sc.nextInt();

            if (distance == 0) {
                break;
            }

         
            fare = (distance <= 5) ? 10 :
                   (distance <= 10) ? 20 :
                   (distance <= 20) ? 30 : 40;

            if (balance >= fare) {
                balance = balance - fare;
                System.out.println("Fare deducted: ₹" + fare);
                System.out.println("Remaining balance: ₹" + balance);
            } 
            else {
                System.out.println("Insufficient balance");
                break;
            }
        }

        System.out.println("\nThank you for using Delhi Metro");
        sc.close();
    }
}
