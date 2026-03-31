import java.util.Scanner;

public class TempConv {

    static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        double t = sc.nextDouble();

        if (ch == 1)
            System.out.println(cToF(t));
        else
            System.out.println(fToC(t));

        sc.close();
    }
}
