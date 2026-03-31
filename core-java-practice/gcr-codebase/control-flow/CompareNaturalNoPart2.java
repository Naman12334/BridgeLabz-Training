import java.util.*;

public class CompareNaturalNoPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum2 = 0;
        int sum =0;
        if(n<=0){
            System.out.println("its not a natural number");

        }else{
             sum = (n * (n - 1)) / 2;
             for(int i=1;i<=n;i++){
                sum2 = sum2 + i;
             }
          

            }
        
        if(sum2 == sum){
            System.out.println("both are same");
        }else{
            System.out.println("no not same");
        }

    }
    
}
