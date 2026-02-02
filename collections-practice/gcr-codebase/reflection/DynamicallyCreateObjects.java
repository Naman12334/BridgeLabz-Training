class Student {
    public String Name = "Harsh";
}

public class DynamicallyCreateObjects {
    public static void main(String[] args) throws Exception {

        
        Class<?> clazz = Student.class;

      
        Object obj = clazz.getDeclaredConstructor().newInstance();

     
        Student s = (Student) obj;

        System.out.println(s.Name);
    }
}
