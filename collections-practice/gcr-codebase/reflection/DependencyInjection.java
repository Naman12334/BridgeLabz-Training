import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface InjectAttribute {
}


class Engine {
}


class Car {

    @InjectAttribute
    public Engine engine;
}


class Container {

    public static <T> T resolve(Class<T> clazz) throws Exception {

      
        T obj = clazz.getDeclaredConstructor().newInstance();

       
        for (Field f : clazz.getFields()) { 
            if (f.getAnnotation(InjectAttribute.class) != null) {

               
                Object dep = f.getType()
                              .getDeclaredConstructor()
                              .newInstance();

               
                f.set(obj, dep);
            }
        }
        return obj;
    }
}


public class DependencyInjection {
    public static void main(String[] args) throws Exception {

        Car c = Container.resolve(Car.class);

        System.out.println(
            c.engine != null ? "Engine Injected!" : "Failed"
        );
    }
}
