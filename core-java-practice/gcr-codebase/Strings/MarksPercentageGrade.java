import java.util.*;
public class MarksPercentageGrade {
	 static int[][] scores(int n) {
	        int[][] a = new int[n][3];
	        for (int i = 0; i < n; i++)
	            for (int j = 0; j < 3; j++)
	                a[i][j] = 40 + (int)(Math.random() * 60);
	        return a;
	    }

	    static char grade(double p) {
	        if (p >= 90) return 'A';
	        if (p >= 75) return 'B';
	        if (p >= 60) return 'C';
	        return 'D';
	    }

	    public static void main(String[] args) {
	        int[][] s = scores(5);

	        System.out.println("P C M T % G");
	        for (int i = 0; i < s.length; i++) {
	            int t = s[i][0] + s[i][1] + s[i][2];
	            double p = Math.round((t / 3.0) * 100) / 100.0;
	            System.out.println(s[i][0] + " " + s[i][1] + " " + s[i][2] +
	                               " " + t + " " + p + " " + grade(p));
	        }
	    }

}
