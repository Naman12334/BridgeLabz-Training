import java.util.*;

public class SumUntilZeroPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while(true){
            int n = sc.nextInt();
            if(n<=0){
                break;
            }else{
                total = total + n;
            }
        }
        System.out.println(total);


    }
  
    
}
