import java.util.*;
public class FrequencyUsingASCII {
	  static String[][] freq(String s) {
	        int[] f = new int[256];
	        for (int i = 0; i < s.length(); i++)
	            f[s.charAt(i)]++;

	        int c = 0;
	        for (int i = 0; i < 256; i++)
	            if (f[i] > 0) c++;

	        String[][] r = new String[c][2];
	        int k = 0;

	        for (int i = 0; i < 256; i++)
	            if (f[i] > 0) {
	                r[k][0] = String.valueOf((char)i);
	                r[k++][1] = String.valueOf(f[i]);
	            }
	        return r;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String[][] a = freq(sc.nextLine());

	        for (String[] x : a)
	            System.out.println(x[0] + " : " + x[1]);
	    }

}
