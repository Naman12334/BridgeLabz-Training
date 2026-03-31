import java.util.*;

public class CheckAndSumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            int sum = n * (n -1) / 2;
            System.out.println("the sum of " + n + "natural is" + sum);
        }else{
            System.out.println("the number" + n + " is not natural number");
        }
        
    }
    
}
