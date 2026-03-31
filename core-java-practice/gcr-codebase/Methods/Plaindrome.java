class Palindrome {
    static int[] rev(int[] a) {
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++)
            r[i] = a[a.length - 1 - i];
        return r;
    }

    static boolean eq(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    static boolean isPal(int n) {
        int[] d = NumberChecker.digits(n);
        return eq(d, rev(d));
    }

    public static void main(String[] args) {
        System.out.println(isPal(1221));
    }
}
