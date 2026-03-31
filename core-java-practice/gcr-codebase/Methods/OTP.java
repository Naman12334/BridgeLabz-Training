public class OTP {
    static int gen() {
        return 100000 + (int)(Math.random() * 900000);
    }

    static boolean unique(int[] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] o = new int[10];
        for (int i = 0; i < 10; i++) o[i] = gen();
        System.out.println(unique(o));
    }
}
