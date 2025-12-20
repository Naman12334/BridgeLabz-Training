import java.util.*;

public class FacorialOnNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        while(n>0){
            sum = sum * n;
            n = n-1;
        }
        System.out.println(sum);
        
    }
    
}
