package StreamBuzz;

import java.util.Scanner;

public class StreamBuzzMenu {

    private CreatorUtil util = new CreatorUtil();
    Scanner sc = new Scanner(System.in);

    public void userMenu() {
        while (true) {
            System.out.println("\n======= Stream Buzz ========");
            System.out.println("1: Create New Creator");
            System.out.println("2: Show Top Posts");
            System.out.println("3: Display Average Weekly Likes");
            System.out.println("4: Exit");
            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();
            sc.nextLine(); 

            switch (ch) {
                case 1:
                    util.registerCreator();
                    break;
                case 2:
                    util.getTopPostCounts();
                    break;
                case 3:
                    util.calculateAverageLikes();
                    break;
                case 4:
                    System.out.println("Logging off — Keep Creating with StreamBuzz!");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
