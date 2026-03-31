import java.util.*;

public class NumberType {
       static int divSum(int n) {
        int s = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0) s += i;
        return s;
    }

    static boolean perfect(int n) { return divSum(n) == n; }
    static boolean abundant(int n) { return divSum(n) > n; }
    static boolean deficient(int n) { return divSum(n) < n; }

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    static boolean strong(int n) {
        int t = n, s = 0;
        while (t > 0) {
            s += fact(t % 10);
            t /= 10;
        }
        return s == n;
    }
}
    

