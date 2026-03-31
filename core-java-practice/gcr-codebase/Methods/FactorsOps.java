
public class FactorsOps {
       static int[] factors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) c++;

        int[] f = new int[c];
        int k = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) f[k++] = i;

        return f;
    }

    static int greatest(int[] f) {
        return f[f.length - 1];
    }

    static int sum(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    static long prod(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    static double cubeProd(int[] f) {
        double p = 1;
        for (int x : f) p *= Math.pow(x, 3);
        return p;
    }
    
}
