import java.util.*;

public class SumOfNumberUntilZero {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double total = 0.0;
        double ask = sc.nextDouble();
        while(ask!=0.0){
            total = total + ask;
            ask = sc.nextDouble();
        }
        System.out.println(total);
    }
    
}
