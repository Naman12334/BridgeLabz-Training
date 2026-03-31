import java.util.*;
public class MarksPercentageAndGradePart2 {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[][] m=new int[n][3];
	        double[] per=new double[n];
	        char[] g=new char[n];
	        for(int i=0;i<n;i++){
	            m[i][0]=sc.nextInt();
	            m[i][1]=sc.nextInt();
	            m[i][2]=sc.nextInt();
	            per[i]=(m[i][0]+m[i][1]+m[i][2])/3.0;
	            if(per[i]>=90)g[i]='A';
	            else if(per[i]>=75)g[i]='B';
	            else if(per[i]>=50)g[i]='C';
	            else g[i]='F';
	        }
	        for(int i=0;i<n;i++)
	            System.out.println(per[i]+" "+g[i]);
		// TODO Auto-generated method stub

	}

}
