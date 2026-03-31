import java.util.*;
public class ArrayIndexOutOfBound {
	  static void gen(String[] a) {
	        System.out.println(a[5]);
	    }

	    static void handle(String[] a) {
	        try {
	            System.out.println(a[5]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException handled");
	        } catch (RuntimeException e) {
	            System.out.println("RuntimeException handled");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        String[] a = new String[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.next();
	        }

	        // gen(a);
	        handle(a);
	    }

}
