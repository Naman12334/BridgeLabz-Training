import java.lang.reflect.Method;

class Worker {
    public void DoWork() {
        for (int i = 0; i < 1_000_000; i++) { }
    }
}

class TimerTool {

    public static void Measure(Object obj, String methodName) throws Exception {

        
        Method m = obj.getClass().getMethod(methodName);

      
        long start = System.nanoTime();
        m.invoke(obj);
        long end = System.nanoTime();

        long timeMs = (end - start) / 1_000_000;
        System.out.println("Time: " + timeMs + " ms");
    }
}

public class MethodExecutionTiming {
    public static void main(String[] args) throws Exception {

        Worker w = new Worker();
        TimerTool.Measure(w, "DoWork");
    }
}
