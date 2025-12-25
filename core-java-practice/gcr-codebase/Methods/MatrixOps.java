
public class MatrixOps {
      static int[][] transpose(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                t[j][i] = a[i][j];
        return t;
    }

    static int det2(int[][] a) {
        return a[0][0]*a[1][1] - a[0][1]*a[1][0];
    }

    static double[][] inv2(int[][] a) {
        int d = det2(a);
        double[][] i = new double[2][2];
        i[0][0] = a[1][1] / (double)d;
        i[0][1] = -a[0][1] / (double)d;
        i[1][0] = -a[1][0] / (double)d;
        i[1][1] = a[0][0] / (double)d;
        return i;
    }
    
}
