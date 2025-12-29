import java.util.Scanner;

public class MaxThree {

    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Max = " + max(a, b, c));
        sc.close();
    }
}
