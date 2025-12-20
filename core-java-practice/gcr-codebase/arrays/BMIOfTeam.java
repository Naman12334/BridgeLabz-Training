import java.util.*;
public class BMIOfTeam {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] w=new double[n];
        double[] h=new double[n];
        double[] bmi=new double[n];
        String[] st=new String[n];
        for(int i=0;i<n;i++){
            w[i]=sc.nextDouble();
            h[i]=sc.nextDouble()/100;
            bmi[i]=w[i]/(h[i]*h[i]);
            if(bmi[i]<18.5)st[i]="Under";
            else if(bmi[i]<25)st[i]="Normal";
            else st[i]="Over";
        }
        for(int i=0;i<n;i++){
            System.out.println(w[i]+" "+h[i]+" "+bmi[i]+" "+st[i]);
        }
		
	}

}
