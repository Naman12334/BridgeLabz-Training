import java.lang.reflect.Field;

class Config {
    private static String KEY = "OLD";
}

public class AccessAndModifyStaticFields {
    public static void main(String[] args) throws Exception {

      
        Field f = Config.class.getDeclaredField("KEY");
        f.setAccessible(true);  

        f.set(null, "NEW_KEY");

      
        System.out.println(f.get(null));
    }
}
