import java.util.*;
public class OddandEven{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0){
            for(int i=1;i<=number;i++){
                if(number % 2 == 0){
                    System.out.println("the number is even");
                }else{
                    System.out.println("the number is odd");
                }
            }
        }else{
            System.out.println("The number is not natural number");
        }
     }
}