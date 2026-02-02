import java.lang.reflect.Method;

class Calculator {
    private int Multiply(int a, int b) {
        return a * b;
    }
}

public class CallPrivateMethod {
    public static void main(String[] args) throws Exception {

        Calculator c = new Calculator();

       
        Method m = Calculator.class.getDeclaredMethod(
                "Multiply", int.class, int.class);

        m.setAccessible(true);   

        Object result = m.invoke(c, 3, 4);

        System.out.println(result);
    }
}
