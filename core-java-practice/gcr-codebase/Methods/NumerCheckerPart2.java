import java.util.*;

public class NumerCheckerPart2 {
      static int cnt(int n) {
        return String.valueOf(n).length();
    }

    static int[] digits(int n) {
        int c = cnt(n);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    static boolean duck(int[] d) {
        for (int x : d) if (x != 0) return true;
        return false;
    }

    static boolean armstrong(int n, int[] d) {
        int p = d.length, s = 0;
        for (int x : d) s += Math.pow(x, p);
        return s == n;
    }

    static int[] large2(int[] d) {
        int f = Integer.MIN_VALUE, s = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > f) { s = f; f = x; }
            else if (x > s && x != f) s = x;
        }
        return new int[]{f, s};
    }

    static int[] small2(int[] d) {
        int f = Integer.MAX_VALUE, s = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < f) { s = f; f = x; }
            else if (x < s && x != f) s = x;
        }
        return new int[]{f, s};
    }

    public static void main(String[] args) {
        int n = 153;
        int[] d = digits(n);

        System.out.println("Duck: " + duck(d));
        System.out.println("Armstrong: " + armstrong(n, d));

        int[] l = large2(d);
        int[] s = small2(d);

        System.out.println("Largest: " + l[0] + " Second: " + l[1]);
        System.out.println("Smallest: " + s[0] + " Second: " + s[1]);
    
}
}
