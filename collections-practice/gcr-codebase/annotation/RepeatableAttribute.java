import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReportAttribute[] value();
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReportAttribute {
    String description();
}


class Developer {

    @BugReportAttribute(description = "Crash on login")
    @BugReportAttribute(description = "UI alignment issue")
    public void FixCode() { }
}


public class RepeatableAttribute {
    public static void main(String[] args) {

        try {
            Method m = Developer.class.getMethod("FixCode");

            BugReportAttribute[] bugs =
                    m.getAnnotationsByType(BugReportAttribute.class);

            for (BugReportAttribute bug : bugs) {
                System.out.println("Bug: " + bug.description());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
