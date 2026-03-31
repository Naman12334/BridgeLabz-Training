import java.util.*;
public class LargestAndSecondpart2 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int max=10;
	        int[] d=new int[max];
	        int idx=0;
	        while(n!=0){
	            if(idx==max){
	                max+=10;
	                int[] t=new int[max];
	                for(int i=0;i<idx;i++)
	                    t[i]=d[i];
	                d=t;
	            }
	            d[idx++]=n%10;
	            n=n/10;
	        }
	        int a=0,b=0;
	        for(int i=0;i<idx;i++){
	            if(d[i]>a){
	                b=a;
	                a=d[i];
	            }else if(d[i]>b){
	                b=d[i];
	            }
	        }
	        System.out.println(a);
	        System.out.println(b);
		
		
		

	}

}
