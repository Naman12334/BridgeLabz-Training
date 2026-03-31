import java.util.*;

public class Email {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String regex =
                "^[a-z]{3,}\\.[a-z]{3,}[0-9]{4,}@(sales|marketing|IT|product)\\.company\\.com$";

        while (n-- > 0) {

            String email = sc.nextLine();

            if (email.matches(regex))
                System.out.println("Access Granted");
            else
                System.out.println("Access Denied");
        }
    }
}