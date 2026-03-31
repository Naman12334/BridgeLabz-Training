import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class MyClass {
    public int number = 10;
    private String text = "Hello";

    public MyClass() { }

    private MyClass(int x) {
        number = x;
    }

    public void Show() {
        System.out.println("Public Show Method");
    }

    private void Secret() {
        System.out.println("Private Secret Method");
    }
}

public class GetClassInformation {
    public static void main(String[] args) throws Exception {

        Class<MyClass> clazz = MyClass.class;

        
        System.out.println("Methods:");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

       
        System.out.println("\nFields:");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(f.getName());
        }

      
        System.out.println("\nConstructors:");
        for (Constructor<?> c : clazz.getDeclaredConstructors()) {
            System.out.println(c);
        }

       
        System.out.println("\n--- Access Private Field ---");
        MyClass obj = new MyClass();

        Field privateField = clazz.getDeclaredField("text");
        privateField.setAccessible(true);   

        System.out.println("Before: " + privateField.get(obj));
        privateField.set(obj, "Changed!");
        System.out.println("After: " + privateField.get(obj));

        
        System.out.println("\n--- Invoke Private Method ---");
        Method privateMethod = clazz.getDeclaredMethod("Secret");
        privateMethod.setAccessible(true); 

        privateMethod.invoke(obj);
    }
}
