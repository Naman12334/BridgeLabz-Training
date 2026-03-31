

public class MatrixOperations {
     static int[][] gen(int r,int c) {
        int[][] a = new int[r][c];
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                a[i][j]=(int)(Math.random()*10);
        return a;
    }

    static int[][] add(int[][] a,int[][] b) {
        int[][] r=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                r[i][j]=a[i][j]+b[i][j];
        return r;
    }
    
}
