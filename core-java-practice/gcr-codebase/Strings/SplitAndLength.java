import java.util.*;
public class SplitAndLength {
	  static int len(String s) {
	        int c = 0;
	        try {
	            while (true) s.charAt(c++);
	        } catch (Exception e) {}
	        return c;
	    }

	    static String[] splitTxt(String s) {
	        int l = len(s), wc = 1;
	        for (int i = 0; i < l; i++)
	            if (s.charAt(i) == ' ') wc++;

	        String[] w = new String[wc];
	        int st = 0, k = 0;

	        for (int i = 0; i <= l; i++) {
	            if (i == l || s.charAt(i) == ' ') {
	                w[k++] = s.substring(st, i);
	                st = i + 1;
	            }
	        }
	        return w;
	    }

	    static String[][] make2D(String[] w) {
	        String[][] a = new String[w.length][2];
	        for (int i = 0; i < w.length; i++) {
	            a[i][0] = w[i];
	            a[i][1] = String.valueOf(len(w[i]));
	        }
	        return a;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();

	        String[][] a = make2D(splitTxt(s));

	        System.out.println("Word\tLength");
	        for (int i = 0; i < a.length; i++)
	            System.out.println(a[i][0] + "\t" + Integer.parseInt(a[i][1]));
	    }
	}


