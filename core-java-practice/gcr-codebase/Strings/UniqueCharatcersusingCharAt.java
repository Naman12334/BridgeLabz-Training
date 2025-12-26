import java.util.*;
public class UniqueCharatcersusingCharAt {
	 static int len(String s) {
	        int i = 0;
	        try { while (true) s.charAt(i++); }
	        catch (Exception e) {}
	        return i;
	    }

	    static char[] uniq(String s) {
	        int l = len(s);
	        char[] t = new char[l];
	        int k = 0;

	        for (int i = 0; i < l; i++) {
	            char c = s.charAt(i);
	            boolean f = true;
	            for (int j = 0; j < i; j++)
	                if (c == s.charAt(j)) f = false;
	            if (f) t[k++] = c;
	        }

	        char[] r = new char[k];
	        for (int i = 0; i < k; i++) r[i] = t[i];
	        return r;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        char[] a = uniq(s);

	        for (char c : a) System.out.print(c + " ");
	    }

}
