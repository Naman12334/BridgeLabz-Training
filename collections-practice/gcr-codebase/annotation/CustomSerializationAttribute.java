import java.lang.annotation.*;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}


class User {

    @JsonField(name = "user_name")
    public String username;

    @JsonField(name = "user_age")
    public int age;

    public String password;
}


class JsonSerializer {

    public static String toJson(Object obj) throws IllegalAccessException {

        Class<?> clazz = obj.getClass();
        StringBuilder sb = new StringBuilder("{ ");

        Field[] fields = clazz.getFields();

        for (Field field : fields) {

            JsonField annotation = field.getAnnotation(JsonField.class);

            if (annotation != null) {
                String key = annotation.name();
                Object value = field.get(obj);

                sb.append("\"")
                  .append(key)
                  .append("\": \"")
                  .append(value)
                  .append("\", ");
            }
        }

        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2); 
        }

        sb.append(" }");
        return sb.toString();
    }
}

public class CustomSerializationAttribute {
    public static void main(String[] args) throws Exception {

        User u = new User();
        u.username = "Harsh";
        u.age = 21;
        u.password = "secret";

        System.out.println(JsonSerializer.toJson(u));
    }
}
