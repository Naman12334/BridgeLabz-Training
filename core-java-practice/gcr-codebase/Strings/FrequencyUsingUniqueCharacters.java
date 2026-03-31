import java.util.*;
public class FrequencyUsingUniqueCharacters {
	 static String[][] freq(String s) {
	        int[] f = new int[256];
	        for (int i = 0; i < s.length(); i++)
	            f[s.charAt(i)]++;

	        boolean[] seen = new boolean[256];
	        int c = 0;
	        for (int i = 0; i < s.length(); i++)
	            if (!seen[s.charAt(i)]) {
	                seen[s.charAt(i)] = true;
	                c++;
	            }

	        String[][] r = new String[c][2];
	        int k = 0;

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if (f[ch] > 0) {
	                r[k][0] = String.valueOf(ch);
	                r[k++][1] = String.valueOf(f[ch]);
	                f[ch] = 0;
	            }
	        }
	        return r;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        for (String[] x : freq(sc.nextLine()))
	            System.out.println(x[0] + " " + x[1]);
	    }
	

}
