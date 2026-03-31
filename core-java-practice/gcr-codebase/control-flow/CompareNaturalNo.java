import java.util.*;

public class CompareNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum2 = 0;
        int sum =0;
        if(n<=0){
            System.out.println("its not a natural number");

        }else{
             sum = (n * (n - 1)) / 2;
            while(n>0){
                sum2 = sum2 + n;
                n = n -1;

            }
        }
        if(sum2 == sum){
            System.out.println("both are same");
        }else{
            System.out.println("no not same");
        }
        
    }
    
}
