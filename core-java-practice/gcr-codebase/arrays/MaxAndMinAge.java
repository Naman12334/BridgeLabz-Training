import java.util.*;
public class MaxAndMinAge {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int[] age=new int[3];
	        int[] h=new int[3];
	        for(int i=0;i<3;i++){
	            age[i]=sc.nextInt();
	            h[i]=sc.nextInt();
	        }
	        int min=age[0],max=h[0];
	        for(int i=1;i<3;i++){
	            if(age[i]<min)min=age[i];
	            if(h[i]>max)max=h[i];
	        }
	        System.out.println("Youngest age:"+min);
	        System.out.println("Tallest height:"+max);
		
		// TODO Auto-generated method stub

	}

}
