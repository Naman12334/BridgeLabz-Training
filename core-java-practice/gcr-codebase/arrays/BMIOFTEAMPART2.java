import java.util.*;
public class BMIOFTEAMPART2 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[][] p=new double[n][3];
        String[] st=new String[n];
        for(int i=0;i<n;i++){
            p[i][0]=sc.nextDouble();
            p[i][1]=sc.nextDouble()/100;
            p[i][2]=p[i][0]/(p[i][1]*p[i][1]);
            if(p[i][2]<18.5)st[i]="Under";
            else if(p[i][2]<25)st[i]="Normal";
            else st[i]="Over";
        }
        for(int i=0;i<n;i++){
            System.out.println(p[i][0]+" "+p[i][1]+" "+p[i][2]+" "+st[i]);
        }

		// TODO Auto-generated method stub

	}

}
