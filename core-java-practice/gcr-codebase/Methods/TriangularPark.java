import java.util.*;

class TriangularPark {
    static double calcRounds(double a, double b, double c) {
        double peri = a + b + c;
        return 5000 / peri;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Rounds needed: " + calcRounds(a, b, c));
    }
}
