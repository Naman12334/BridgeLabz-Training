import java.util.Scanner;

public class MovieBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.print("Movie Type (2D/3D): ");
            String m = sc.next();

            System.out.print("Seat Type (gold/silver): ");
            String s = sc.next();

            System.out.print("Snacks (yes/no): ");
            String sn = sc.next();

            int amt = 0;

            switch (m) {
                case "2D":
                    amt = (s.equals("gold")) ? 200 : 150;
                    break;
                case "3D":
                    amt = (s.equals("gold")) ? 300 : 250;
                    break;
            }

            if (sn.equals("yes"))
                amt += 100;

            System.out.println("Total Amount = ₹" + amt);

            System.out.print("Next customer? (y/n): ");
            ch = sc.next().charAt(0);

        } while (ch == 'y');

        sc.close();
    }
}
