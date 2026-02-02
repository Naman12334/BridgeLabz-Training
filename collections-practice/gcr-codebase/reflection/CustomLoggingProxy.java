import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


interface IGreeting {
    void SayHello();
}

class Greeting implements IGreeting {
    public void SayHello() {
        System.out.println("Hello!");
    }
}

class LogProxy implements InvocationHandler {

    private Object target;

    public LogProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        System.out.println("Calling Method: " + method.getName());
        return method.invoke(target, args);
    }
}


public class CustomLoggingProxy {
    public static void main(String[] args) {

        IGreeting greeting = new Greeting();

        IGreeting proxy = (IGreeting) Proxy.newProxyInstance(
                IGreeting.class.getClassLoader(),
                new Class<?>[]{IGreeting.class},
                new LogProxy(greeting)
        );

        proxy.SayHello();
    }
}
