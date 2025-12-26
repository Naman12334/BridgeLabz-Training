import java.util.*;
class PalindromicCheck {
	class Palindrome {
	    static boolean chk1(String s) {
	        int i = 0, j = s.length() - 1;
	        while (i < j)
	            if (s.charAt(i++) != s.charAt(j--)) return false;
	        return true;
	    }

	    static boolean chk2(String s, int i, int j) {
	        if (i >= j) return true;
	        if (s.charAt(i) != s.charAt(j)) return false;
	        return chk2(s, i + 1, j - 1);
	    }

	    static boolean chk3(String s) {
	        char[] a = s.toCharArray();
	        String r = "";
	        for (int i = s.length() - 1; i >= 0; i--)
	            r += s.charAt(i);
	        return s.equals(r);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();

	        System.out.println(chk1(s));
	        System.out.println(chk2(s, 0, s.length() - 1));
	        System.out.println(chk3(s));
	    }

	}
}
