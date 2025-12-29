import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Due Day: ");
            int d = sc.nextInt();

            System.out.print("Return Day: ");
            int r = sc.nextInt();

            if (r > d) {
                int fine = (r - d) * 5;
                System.out.println("Fine = ₹" + fine);
            } else {
                System.out.println("No Fine");
            }
        }

      
    }
}