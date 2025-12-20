import java.util.*;

public class MulitiPlication6to9 {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] res=new int[4];
        int j=0;
        for(int i=6;i<=9;i++){
            res[j]=n*i;
            System.out.println(n+" * "+i+" = "+res[j]);
            j++;
        }
        sc.close();
    }
}
    

