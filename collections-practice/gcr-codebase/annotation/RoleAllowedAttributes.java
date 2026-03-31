import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowedAttribute {
    String role();
}


class AdminPanel {

    @RoleAllowedAttribute(role = "ADMIN")
    public void DeleteUser() {
        System.out.println("User Deleted!");
    }

    @RoleAllowedAttribute(role = "USER")
    public void ViewProfile() {
        System.out.println("Profile Viewed!");
    }
}


class CurrentUser {
    public static String Role = "USER";
}

class AccessController {

    public static void Execute(Object obj, String methodName) throws Exception {

        Method method = obj.getClass().getMethod(methodName);
        RoleAllowedAttribute attr =
                method.getAnnotation(RoleAllowedAttribute.class);

        if (attr != null) {
            if (CurrentUser.Role.equals(attr.role())) {
                method.invoke(obj);
            } else {
                System.out.println("Access Denied!");
            }
        } else {
            method.invoke(obj);
        }
    }
}


public class RoleAllowedAttributes {
    public static void main(String[] args) throws Exception {

        AdminPanel panel = new AdminPanel();

        AccessController.Execute(panel, "DeleteUser");
        AccessController.Execute(panel, "ViewProfile");

        CurrentUser.Role = "ADMIN";
        AccessController.Execute(panel, "DeleteUser");
    }
}
