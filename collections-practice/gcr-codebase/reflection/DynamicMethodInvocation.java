import java.lang.reflect.Method;
import java.util.Scanner;

class MathOp {
    public int Add(int a, int b) { return a + b; }
    public int Sub(int a, int b) { return a - b; }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {

        MathOp m = new MathOp();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter method name (Add/Sub): ");
        String name = sc.nextLine();

       
        Method method = MathOp.class.getMethod(name, int.class, int.class);

 
        Object result = method.invoke(m, 10, 5);

        System.out.println(result);
    }
}
