import java.util.*;

public class ArmsStrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
           int t=n;
            int s=0;
            while(t!=0){
          int d=t%10;
         s=s+d*d*d;
       t=t/10;
}
if(s==n)System.out.println("Armstrong");
else System.out.println("Not Armstrong");
    }
    
}
