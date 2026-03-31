import java.util.*;
public class LargestAndSecondLargest {
	 public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[] d=new int[10];
	        int idx=0;
	        while(n!=0&&idx<10){
	            d[idx++]=n%10;
	            n=n/10;
	        }
	        int max=0,sec=0;
	        for(int i=0;i<idx;i++){
	            if(d[i]>max){
	                sec=max;
	                max=d[i];
	            }else if(d[i]>sec){
	                sec=d[i];
	            }
	        }
	        System.out.println(max);
	        System.out.println(sec);
	    }
	

}
