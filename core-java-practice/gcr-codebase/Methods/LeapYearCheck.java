import java.util.*;

public class LeapYearCheck {
      static boolean isLeap(int y) {
        if (y < 1582) return false;
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if (isLeap(y))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
    
}
