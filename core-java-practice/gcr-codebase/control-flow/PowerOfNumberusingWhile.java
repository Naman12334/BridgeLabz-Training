import java.util.*;

public class PowerOfNumberusingWhile {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int power = sc.nextInt();

        int res = 1;
        int i = 0;

        while (i < power) {
            res = res * number;
            i++;
        }

        System.out.println(res);
    }
}














    
    
