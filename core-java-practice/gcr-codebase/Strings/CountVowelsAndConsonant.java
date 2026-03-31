import java.util.*;
public class CountVowelsAndConsonant {
	  static int chk(char c) {
	        if (c >= 'A' && c <= 'Z') c += 32;
	        if (c >= 'a' && c <= 'z') {
	            if ("aeiou".indexOf(c) != -1) return 1;
	            return 2;
	        }
	        return 0;
	    }

	    static int[] cnt(String s) {
	        int v = 0, c = 0;
	        for (int i = 0; i < s.length(); i++) {
	            int r = chk(s.charAt(i));
	            if (r == 1) v++;
	            if (r == 2) c++;
	        }
	        return new int[]{v, c};
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();

	        int[] r = cnt(s);
	        System.out.println("Vowels     : " + r[0]);
	        System.out.println("Consonants : " + r[1]);
	    }

}
