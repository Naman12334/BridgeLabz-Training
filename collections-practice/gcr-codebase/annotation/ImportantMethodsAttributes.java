import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethodAttribute {

   
    String level() default "HIGH";
}


class Work {

    @ImportantMethodAttribute       
    public void SaveData() { }

    @ImportantMethodAttribute(level = "CRITICAL")
    public void DeleteAll() { }

    public void NormalTask() { }
}


public class ImportantMethodsAttributes {
    public static void main(String[] args) {

        Method[] methods = Work.class.getMethods();

        for (Method m : methods) {
            ImportantMethodAttribute attr =
                    m.getAnnotation(ImportantMethodAttribute.class);

            if (attr != null) {
                System.out.println(m.getName() + " - Level: " + attr.level());
            }
        }
    }
}
