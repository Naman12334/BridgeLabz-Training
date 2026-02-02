import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todos {
    TodoAttribute[] value();
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(Todos.class)
@interface TodoAttribute {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}


class Project {

    @TodoAttribute(task = "Add payment gateway", assignedTo = "Harsh", priority = "HIGH")
    @TodoAttribute(task = "Improve UI", assignedTo = "Riya")
    public void BuildApp() { }

    @TodoAttribute(task = "Fix security bug", assignedTo = "Aman", priority = "CRITICAL")
    public void SecurityModule() { }
}

public class TodoAttributes {
    public static void main(String[] args) {

        for (Method m : Project.class.getMethods()) {

            TodoAttribute[] todos =
                    m.getAnnotationsByType(TodoAttribute.class);

            for (TodoAttribute t : todos) {
                System.out.println("Method: " + m.getName());
                System.out.println("Task: " + t.task());
                System.out.println("Assigned To: " + t.assignedTo());
                System.out.println("Priority: " + t.priority());
                System.out.println();
            }
        }
    }
}
