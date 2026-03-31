import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          boolean isP=true;
         if(n<=1)isP=false;
          for(int i=2;i<n;i++){
          if(n%i==0){
        isP=false;
        break;
      }
   }
    if(isP)System.out.println("Prime");
   else System.out.println("Not Prime");
    }
    
}
