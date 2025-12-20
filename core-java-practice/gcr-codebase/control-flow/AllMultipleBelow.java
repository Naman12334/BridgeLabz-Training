import java.util.*;

public class AllMultipleBelow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input");
        } else {
            int i = 100;
            while (i > 1) {
                if (i % number == 0) {
                    System.out.println(i);
                }
                i--;
            }
        }
    }
}

        
    
    

