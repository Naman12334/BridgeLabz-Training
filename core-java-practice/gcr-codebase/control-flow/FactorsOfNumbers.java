import java.util.*;

public class FactorsOfNumbers {
   
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("its is not a positive integer.");
        } else {
            System.out.println("Factors");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
    
}
