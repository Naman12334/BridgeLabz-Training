import java.util.*;

public class FootBallTeam {
      static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }

    static int min(int[] a) {
        int m = a[0];
        for (int x : a) m = Math.min(m, x);
        return m;
    }

    static int max(int[] a) {
        int m = a[0];
        for (int x : a) m = Math.max(m, x);
        return m;
    }

    static double mean(int[] a) {
        return sum(a) / (double)a.length;
    }

    public static void main(String[] args) {
        int[] h = new int[11];
        for (int i = 0; i < 11; i++)
            h[i] = 150 + (int)(Math.random() * 101);

        System.out.println("Shortest: " + min(h));
        System.out.println("Tallest: " + max(h));
        System.out.println("Mean: " + mean(h));
    }
}
    

