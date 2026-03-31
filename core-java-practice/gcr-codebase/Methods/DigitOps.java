public class DigitOps {
    static int sum(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    static double sumSq(int[] d) {
        double s = 0;
        for (int x : d) s += Math.pow(x, 2);
        return s;
    }

    static boolean harshad(int n, int[] d) {
        return n % sum(d) == 0;
    }

    public static void main(String[] args) {
        int n = 21;
        int[] d = NumberChecker.digits(n);

        System.out.println("Sum: " + sum(d));
        System.out.println("SumSq: " + sumSq(d));
        System.out.println("Harshad: " + harshad(n, d));
    }
}
