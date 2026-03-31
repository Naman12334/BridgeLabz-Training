class SpecialNums {
    static boolean prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }

    static boolean neon(int n) {
        int s = 0, sq = n * n;
        while (sq > 0) { s += sq % 10; sq /= 10; }
        return s == n;
    }

    static boolean spy(int n) {
        int s = 0, p = 1;
        while (n > 0) {
            int d = n % 10;
            s += d; p *= d; n /= 10;
        }
        return s == p;
    }

    static boolean auto(int n) {
        return String.valueOf(n * n).endsWith("" + n);
    }

    static boolean buzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
}
