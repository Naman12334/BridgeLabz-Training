import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)          
@Target(ElementType.METHOD)                 
@interface TaskInfo {
    int priority();
    String assignedTo();
}


class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Harsh")
    public void completeTask() {
    
    }
}


public class Customattribute{
    public static void main(String[] args) throws Exception {

        Method method = TaskManager.class.getMethod("completeTask");

        TaskInfo annotation = method.getAnnotation(TaskInfo.class);

        System.out.println("Priority: " + annotation.priority());
        System.out.println("Assigned To: " + annotation.assignedTo());
    }
}
