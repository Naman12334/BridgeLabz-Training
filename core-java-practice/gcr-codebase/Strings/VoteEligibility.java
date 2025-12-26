import java.util.*;
public class VoteEligibility {
	 static int[] ages(int n) {
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++)
	            a[i] = (int)(Math.random() * 90);
	        return a;
	    }

	    static String[][] chk(int[] a) {
	        String[][] r = new String[a.length][2];
	        for (int i = 0; i < a.length; i++) {
	            r[i][0] = String.valueOf(a[i]);
	            r[i][1] = (a[i] >= 18) ? "Can Vote" : "Cannot Vote";
	        }
	        return r;
	    }

	    public static void main(String[] args) {
	        int[] a = ages(10);
	        String[][] r = chk(a);

	        System.out.println("Age\tStatus");
	        for (int i = 0; i < r.length; i++)
	            System.out.println(r[i][0] + "\t" + r[i][1]);
	    }

}
