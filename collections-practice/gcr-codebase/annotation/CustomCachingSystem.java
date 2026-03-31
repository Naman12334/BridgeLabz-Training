import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResultAttribute {
}


class Calculator {

    @CacheResultAttribute
    public int Square(int n) {
        System.out.println("Calculating square...");
        return n * n;
    }
}


class CacheExecutor {

    private static Map<String, Object> cache = new HashMap<>();

    public static Object Execute(Object obj, String methodName, Object[] parameters)
            throws Exception {

        Method method = obj.getClass().getMethod(methodName, int.class);
        CacheResultAttribute attr = method.getAnnotation(CacheResultAttribute.class);

        String key = methodName + "_" + parameters[0];

        if (attr != null && cache.containsKey(key)) {
            System.out.println("Returning cached result");
            return cache.get(key);
        }

        Object result = method.invoke(obj, parameters);

        if (attr != null) {
            cache.put(key, result);
        }

        return result;
    }
}


public class CustomCachingSystem {
    public static void main(String[] args) throws Exception {

        Calculator c = new Calculator();

        System.out.println(CacheExecutor.Execute(c, "Square", new Object[]{4}));
        System.out.println(CacheExecutor.Execute(c, "Square", new Object[]{4}));
    }
}
