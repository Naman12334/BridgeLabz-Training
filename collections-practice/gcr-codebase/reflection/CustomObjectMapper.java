import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


class Student {
    public String Name;
    public int Age;
}


class Mapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> props)
            throws Exception {

       
        T obj = clazz.getDeclaredConstructor().newInstance();

        
        for (Map.Entry<String, Object> entry : props.entrySet()) {
            Field field = clazz.getField(entry.getKey()); 
            if (field != null) {
                field.set(obj, entry.getValue());
            }
        }
        return obj;
    }
}


public class CustomObjectMapper {
    public static void main(String[] args) throws Exception {

        Map<String, Object> data = new HashMap<>();
        data.put("Name", "Harsh");
        data.put("Age", 21);

        Student s = Mapper.toObject(Student.class, data);
        System.out.println(s.Name + " " + s.Age);
    }
}
