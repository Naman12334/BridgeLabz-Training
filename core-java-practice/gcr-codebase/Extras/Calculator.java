import java.util.Scanner;

public class Calculator {

    static int add(int a, int b) { return a + b; }
    static int sub(int a, int b) { return a - b; }
    static int mul(int a, int b) { return a * b; }
    static int div(int a, int b) { return a / b; }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int ch = sc.nextInt();

        switch (ch) {
            case 1: System.out.println(add(a, b)); break;
            case 2: System.out.println(sub(a, b)); break;
            case 3: System.out.println(mul(a, b)); break;
            case 4: System.out.println(div(a, b)); break;
        }

        sc.close();
    }
}
