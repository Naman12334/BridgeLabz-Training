import java.util.*;
public class ShortestAndLongest {
	   static int[] find(String[][] a) {
	        int min = Integer.MAX_VALUE, max = 0;
	        for (int i = 0; i < a.length; i++) {
	            int l = Integer.parseInt(a[i][1]);
	            if (l < min) min = l;
	            if (l > max) max = l;
	        }
	        return new int[]{min, max};
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();

	        String[] w = s.split(" ");
	        String[][] a = new String[w.length][2];
	        for (int i = 0; i < w.length; i++) {
	            a[i][0] = w[i];
	            a[i][1] = String.valueOf(w[i].length());
	        }

	        int[] r = find(a);
	        System.out.println("Shortest Length : " + r[0]);
	        System.out.println("Longest Length  : " + r[1]);
	    }

}
