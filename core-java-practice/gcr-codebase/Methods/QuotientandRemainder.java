import java.util.*;

public class QuotientandRemainder {
       static int[] findRemainderAndQuotient(int n, int d) {
        return new int[]{n / d, n % d};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] r = findRemainderAndQuotient(n, d);
        System.out.println("Quotient: " + r[0]);
        System.out.println("Remainder: " + r[1]);
    }
    
}
