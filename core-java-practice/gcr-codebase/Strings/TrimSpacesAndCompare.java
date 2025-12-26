import java.util.*;
public class TrimSpacesAndCompare {
	  static int[] trimIdx(String s) {
	        int st = 0, en = s.length() - 1;
	        while (s.charAt(st) == ' ') st++;
	        while (s.charAt(en) == ' ') en--;
	        return new int[]{st, en + 1};
	    }

	    static String sub(String s, int a, int b) {
	        String r = "";
	        for (int i = a; i < b; i++) r += s.charAt(i);
	        return r;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();

	        int[] i = trimIdx(s);
	        String r1 = sub(s, i[0], i[1]);
	        String r2 = s.trim();

	        System.out.println("Same : " + r1.equals(r2));
	    }

}
