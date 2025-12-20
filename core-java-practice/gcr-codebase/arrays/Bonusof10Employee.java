import java.util.*;
public class Bonusof10Employee {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	        double[] sal=new double[10];
	        double[] yr=new double[10];
	        double[] bonus=new double[10];
	        double[] nsal=new double[10];
	        double tbonus=0,tsal=0,tnsal=0;
	        for(int i=0;i<10;i++){
	            sal[i]=sc.nextDouble();
	            yr[i]=sc.nextDouble();
	            if(sal[i]<0||yr[i]<0){
	                i--;
	                continue;
	            }
	        }
	        for(int i=0;i<10;i++){
	            if(yr[i]>5)
	                bonus[i]=sal[i]*0.05;
	            else
	                bonus[i]=sal[i]*0.02;
	            nsal[i]=sal[i]+bonus[i];
	            tbonus+=bonus[i];
	            tsal+=sal[i];
	            tnsal+=nsal[i];
	        }
	        System.out.println(tbonus);
	        System.out.println(tsal);
	        System.out.println(tnsal);
	

	}

}
