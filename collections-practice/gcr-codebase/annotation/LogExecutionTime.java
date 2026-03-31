import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTimeAttribute {
}


class Worker {

    @LogExecutionTimeAttribute
    public void FastMethod() {
        for (int i = 0; i < 100000; i++) { }
    }

    @LogExecutionTimeAttribute
    public void SlowMethod() throws InterruptedException {
        Thread.sleep(500);
    }
}


public class LogExecutionTime
 {
    public static void main(String[] args) throws Exception {

        Worker w = new Worker();

        for (Method m : Worker.class.getMethods()) {

            if (m.getAnnotation(LogExecutionTimeAttribute.class) != null) {

                long start = System.nanoTime();
                m.invoke(w);
                long end = System.nanoTime();

                long timeMs = (end - start) / 1_000_000;

                System.out.println(m.getName() + " took " + timeMs + " ms");
            }
        }
    }
}
