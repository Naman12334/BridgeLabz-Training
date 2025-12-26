import java.util.*;
public class SplitAndCompare {
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

	    static boolean cmp(String[] a, String[] b) {
	        if (a.length != b.length) return false;
	        for (int i = 0; i < a.length; i++)
	            if (!a[i].equals(b[i])) return false;
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();

	        String[] a = splitTxt(s);
	        String[] b = s.split(" ");

	        System.out.println("Same : " + cmp(a, b));
	    }

}
