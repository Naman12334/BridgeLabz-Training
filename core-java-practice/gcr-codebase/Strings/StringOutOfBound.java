 import java.util.*;
public class StringOutOfBound {
	 static void gen(String s) {
	        s.charAt(10);
	    }

	    static void handle(String s) {
	        try {
	            s.charAt(10);
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException handled");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();

	        // gen(s);
	        handle(s);
	    }
	}


