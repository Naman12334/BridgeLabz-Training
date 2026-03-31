import java.util.Scanner;

public class BMI {
    static void calc(double[][] d) {
        for (int i = 0; i < 10; i++) {
            double h = d[i][1] / 100;
            d[i][2] = d[i][0] / (h * h);
        }
    }

    static String status(double b) {
        if (b < 18.5) return "Underweight";
        if (b < 25) return "Normal";
        if (b < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] d = new double[10][3];

        for (int i = 0; i < 10; i++) {
            d[i][0] = sc.nextDouble(); // weight
            d[i][1] = sc.nextDouble(); // height
        }

        calc(d);

        for (int i = 0; i < 10; i++) {
            System.out.println(d[i][2] + " " + status(d[i][2]));
        }
    }
}
