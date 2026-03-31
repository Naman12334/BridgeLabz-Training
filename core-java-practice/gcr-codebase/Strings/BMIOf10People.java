import java.util.*;
public class BMIOf10People {
	   static String[][] calc(double[][] a) {
	        String[][] r = new String[10][4];

	        for (int i = 0; i < 10; i++) {
	            double w = a[i][0];
	            double h = a[i][1] / 100;
	            double bmi = w / (h * h);
	            String st = bmi < 18.5 ? "Underweight"
	                      : bmi < 25 ? "Normal"
	                      : bmi < 30 ? "Overweight" : "Obese";

	            r[i][0] = String.valueOf(a[i][1]);
	            r[i][1] = String.valueOf(w);
	            r[i][2] = String.format("%.2f", bmi);
	            r[i][3] = st;
	        }
	        return r;
	    }

	    static void disp(String[][] a) {
	        System.out.println("Ht  Wt  BMI  Status");
	        for (String[] x : a)
	            System.out.println(x[0]+" "+x[1]+" "+x[2]+" "+x[3]);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[][] a = new double[10][2];

	        for (int i = 0; i < 10; i++) {
	            a[i][0] = sc.nextDouble();
	            a[i][1] = sc.nextDouble();
	        }
	        disp(calc(a));
	    }

}
