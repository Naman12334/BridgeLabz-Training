import java.util.*;

public class GreatestFactorpart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int number = sc.nextInt();
        int factor = 1;
        int i = number - 1;

        while (i >= 1) {
            if (number % i == 0) {
                factor = i;
                break;
            }
            i--;
        }

        System.out.println(factor);
    }
}
    
    

