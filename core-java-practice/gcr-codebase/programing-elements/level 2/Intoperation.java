import java.util.*;

public class Intoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int op1 = a + b *c;
        int op2 =  a * b + c;
        int op3 = c + a / b;
        int op4 =  a % b + c;
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(op4);
        
    }
    
}
