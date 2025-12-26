import java.util.*;
public class DisplayChararctertypein2D {
	  static String type(char c) {
	        if (c >= 'A' && c <= 'Z') c += 32;
	        if (c >= 'a' && c <= 'z')
	            return "aeiou".indexOf(c) != -1 ? "Vowel" : "Consonant";
	        return "Not Letter";
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();

	        System.out.println("Char\tType");
	        for (int i = 0; i < s.length(); i++)
	            System.out.println(s.charAt(i) + "\t" + type(s.charAt(i)));
	    }

}
