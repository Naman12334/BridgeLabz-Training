import java.util.*;

 public class Factors {
  public  static int[] getFactors(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) cnt++;

        int[] f = new int[cnt];
        int k = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) f[k++] = i;

        return f;
    }

   public static int sum(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

  public  static int prod(int[] f) {
        int p = 1;
        for (int x : f) p *= x;
        return p;
    }

  public  static double sumSq(int[] f) {
        double s = 0;
        for (int x : f) s += Math.pow(x, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] f = getFactors(n);

        for (int x : f) System.out.print(x + " ");
        System.out.println("\nSum: " + sum(f));
        System.out.println("Product: " + prod(f));
        System.out.println("Sum of Squares: " + sumSq(f));
    }
}
