import java.util.*;

public class Chocolates {
     static int[] findRemainderAndQuotient(int c, int ch) {
        return new int[]{c / ch, c % ch};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int ch = sc.nextInt();

        int[] r = findRemainderAndQuotient(c, ch);
        System.out.println("Each child gets: " + r[0]);
        System.out.println("Remaining: " + r[1]);
    }
    
}
