import java.util.*;
public class CompareSubString {
	 static String sub(String s, int st, int en) {
	        String r = "";
	        for (int i = st; i < en; i++) {
	            r += s.charAt(i);
	        }
	        return r;
	    }

	    static boolean cmp(String a, String b) {
	        if (a.length() != b.length()) return false;
	        for (int i = 0; i < a.length(); i++) {
	            if (a.charAt(i) != b.charAt(i)) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String s = sc.next();
	        int st = sc.nextInt();
	        int en = sc.nextInt();

	        String r1 = sub(s, st, en);
	        String r2 = s.substring(st, en);

	        System.out.println("Same : " + cmp(r1, r2));
	    }
	}


	
	


