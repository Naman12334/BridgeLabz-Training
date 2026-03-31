import java.util.*;
public class FrequencyUsingNestedLoops {
	   static String[] freq(String s) {
	        char[] a = s.toCharArray();
	        int[] f = new int[a.length];

	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == '0') continue;
	            f[i] = 1;
	            for (int j = i + 1; j < a.length; j++) {
	                if (a[i] == a[j]) {
	                    f[i]++;
	                    a[j] = '0';
	                }
	            }
	        }

	        int c = 0;
	        for (int x : f) if (x > 0) c++;

	        String[] r = new String[c];
	        int k = 0;

	        for (int i = 0; i < a.length; i++)
	            if (f[i] > 0)
	                r[k++] = a[i] + " : " + f[i];

	        return r;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        for (String x : freq(sc.nextLine()))
	            System.out.println(x);
	    }

}
