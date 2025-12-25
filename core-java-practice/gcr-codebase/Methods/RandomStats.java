import java.util.*;
public class RandomStats {
   public static int[] gen(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = 1000 + (int)(Math.random() * 9000);
        return a;
    }

  public  static double[] calc(int[] a) {
        int min = a[0], max = a[0], sum = 0;

        for (int x : a) {
            sum += x;
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return new double[]{sum / (double)a.length, min, max};
    }

    public static void main(String[] args) {
        int[] a = gen(5);
        double[] r = calc(a);

        for (int x : a) System.out.print(x + " ");
        System.out.println("\nAvg: " + r[0]);
        System.out.println("Min: " + r[1]);
        System.out.println("Max: " + r[2]);
    }
}
