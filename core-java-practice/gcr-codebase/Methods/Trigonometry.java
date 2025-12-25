import java.util.*;

class Trigonometry {
    static double[] calculateTrigonometricFunctions(double ang) {
        double rad = Math.toRadians(ang);
        return new double[]{
            Math.sin(rad),
            Math.cos(rad),
            Math.tan(rad)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double[] r = calculateTrigonometricFunctions(a);

        System.out.println("Sin: " + r[0]);
        System.out.println("Cos: " + r[1]);
        System.out.println("Tan: " + r[2]);
    }
}
