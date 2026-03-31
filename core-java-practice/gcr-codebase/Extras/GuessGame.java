import java.util.Scanner;
import java.util.Random;

public class GuessGame {

    static int gen(int l, int h) {
        return l + new Random().nextInt(h - l + 1);
    }

    static String fb(Scanner sc) {
        System.out.print("Enter feedback (low/high/correct): ");
        return sc.next();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l = 1, h = 100;
        String f;

        System.out.println("Think of a number between 1 and 100");

        while (true) {
            int g = gen(l, h);
            System.out.println("Computer guess: " + g);
            f = fb(sc);

            if (f.equals("correct"))
                break;
            else if (f.equals("low"))
                l = g + 1;
            else
                h = g - 1;
        }

        System.out.println("Guessed correctly!");
        sc.close();
    }
}
