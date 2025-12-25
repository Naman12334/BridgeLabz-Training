

public class PCMMarks {
     static int[][] gen(int n) {
        int[][] m = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = 10 + (int)(Math.random() * 90);
        return m;
    }

    static double[][] calc(int[][] m) {
        double[][] r = new double[m.length][3];
        for (int i = 0; i < m.length; i++) {
            int t = m[i][0] + m[i][1] + m[i][2];
            r[i][0] = t;
            r[i][1] = Math.round((t / 3.0) * 100) / 100.0;
            r[i][2] = Math.round((t / 300.0) * 10000) / 100.0;
        }
        return r;
    }
    
}
