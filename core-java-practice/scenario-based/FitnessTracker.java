import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] p = new int[7];
        int sum = 0, d = 0;

        System.out.println("Enter push-ups for 7 days (0 = rest day):");

        for (int i = 0; i < 7; i++) {
            p[i] = sc.nextInt();
        }

        for (int x : p) {
            if (x == 0)
                continue;   // rest day
            sum += x;
            d++;
        }

        double avg = (double) sum / d;

        System.out.println("Total Push-ups = " + sum);
        System.out.println("Average Push-ups = " + avg);

        sc.close();
    }
}
