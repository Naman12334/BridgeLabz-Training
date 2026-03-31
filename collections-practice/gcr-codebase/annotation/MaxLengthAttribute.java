import java.lang.annotation.*;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}


class User {

    @MaxLength(10)
    public String username;

    public User(String username) {

        try {
            Field field = User.class.getField("username");
            MaxLength attr = field.getAnnotation(MaxLength.class);

            if (attr != null && username.length() > attr.value()) {
                throw new IllegalArgumentException("Username too long!");
            }

            this.username = username;

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}

public class MaxLengthAttribute {
    public static void main(String[] args) {

        User u1 = new User("Harsh");
        System.out.println("User1 created: " + u1.username);

      
        User u2 = new User("Harshhhhhhhhhhhhhhhhh");
    }
}
