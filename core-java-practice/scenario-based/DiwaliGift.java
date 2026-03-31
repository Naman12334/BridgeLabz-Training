import java.util.Scanner;

class DiwaliGift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        char ch = 0; 
        ;

        do {
            System.out.print("Enter drawn number: ");
            
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Try again.");
                sc.next(); 
                continue;
            }

            num = sc.nextInt();

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Congratulations! You won a gift 🎁");
            } else {
                System.out.println("Sorry! No gift this time.");
            }

            System.out.print("Next visitor? (y/n): ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        sc.close();
    }
}
