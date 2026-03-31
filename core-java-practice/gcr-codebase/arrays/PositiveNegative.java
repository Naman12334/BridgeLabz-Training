import java.util.*;

public class PositiveNegative {
     public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]>0){
                if(arr[i]%2==0)
                    System.out.println(arr[i]+" Even");
                else
                    System.out.println(arr[i]+" Odd");
            }else if(arr[i]<0){
                System.out.println(arr[i]+" Negative");
            }else{
                System.out.println("Zero");
            }
        }
        if(arr[0]==arr[4])
            System.out.println("Equal");
        else if(arr[0]>arr[4])
            System.out.println("First Greater");
        else
            System.out.println("Last Greater");
    }
    
}
