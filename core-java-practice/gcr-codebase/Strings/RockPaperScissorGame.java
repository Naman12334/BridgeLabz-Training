import java.util.*;
public class RockPaperScissorGame {
	 static String comp() {
	        int r = (int)(Math.random() * 3);
	        return (r == 0) ? "rock" : (r == 1) ? "paper" : "scissors";
	    }

	    static int win(String u, String c) {
	        if (u.equals(c)) return 0;
	        if (u.equals("rock") && c.equals("scissors") ||
	            u.equals("paper") && c.equals("rock") ||
	            u.equals("scissors") && c.equals("paper")) return 1;
	        return -1;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int uw = 0, cw = 0;

	        for (int i = 0; i < n; i++) {
	            String u = sc.next();
	            String c = comp();
	            int r = win(u, c);
	            if (r == 1) uw++;
	            if (r == -1) cw++;
	        }

	        System.out.println("User Wins     : " + uw);
	        System.out.println("Computer Wins : " + cw);
	        System.out.println("User %        : " + (uw * 100.0 / n));
	    }

}
