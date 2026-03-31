import java.lang.reflect.Field;

class JsonHelper {

    public static String toJson(Object obj) {
        Class<?> clazz = obj.getClass();
        StringBuilder sb = new StringBuilder("{ ");

       
        Field[] fields = clazz.getFields();

        for (Field f : fields) {
            try {
                sb.append("\"")
                  .append(f.getName())
                  .append("\": \"")
                  .append(f.get(obj))
                  .append("\", ");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

      
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);
        }

        sb.append(" }");
        return sb.toString();
    }
}

class Student {
    public String Name;
    public int Age;
}


public class ConvertToJSON {
    public static void main(String[] args) {

        Student s = new Student();
        s.Name = "Harsh";
        s.Age = 21;

        System.out.println(JsonHelper.toJson(s));
    }
}
