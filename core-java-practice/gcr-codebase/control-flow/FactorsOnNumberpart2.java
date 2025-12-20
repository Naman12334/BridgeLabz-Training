import java.util.*;

public class FactorsOnNumberpart2 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("its is not a positive integer");
        } else {
            int i = 1;
            while (i < number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
    
}
