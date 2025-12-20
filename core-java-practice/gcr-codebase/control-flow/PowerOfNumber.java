import java.util.*;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
        int power = sc.nextInt();

        int res = 1;

        for (int i = 1; i <= power; i++) {
            res = res * number;
        }

        System.out.println(res);
    }
}

    
    

