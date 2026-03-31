import java.util.*;

public class MultiplicationTable {
      public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] t=new int[10];
        for(int i=1;i<=10;i++){
            t[i-1]=n*i;
        }
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+t[i-1]);
        }
    }
    
}
