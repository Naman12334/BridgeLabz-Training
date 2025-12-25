import java.util.*;

public class NaturalRecursive {
     static int recSum(int n) {
        if (n == 0) return 0;
        return n + recSum(n - 1);
    }

    static int forSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("NotaNaturalNumber");
            return;
        }

        int a = recSum(n);
        int b = forSum(n);

        System.out.println("Recursive Sum" + a);
        System.out.println("Formula Sum" + b);
    }
    
}
