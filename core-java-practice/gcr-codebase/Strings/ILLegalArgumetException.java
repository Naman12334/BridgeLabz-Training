import java.util.*;
public class ILLegalArgumetException {
	  static void gen(String s) {
	        s.substring(5, 2);
	    }

	    static void handle(String s) {
	        try {
	            s.substring(5, 2);
	        } catch (IllegalArgumentException e) {
	            System.out.println("IllegalArgumentException handled");
	        } catch (RuntimeException e) {
	            System.out.println("RuntimeException handled");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();

	        // gen(s);
	        handle(s);
	    }
	}

	

