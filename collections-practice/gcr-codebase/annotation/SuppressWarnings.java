import java.util.ArrayList;

public class SuppressWarnings {
    public static void main(String[] args) {

        @SuppressWarnings({"rawtypes", "unchecked"})
        ArrayList list = new ArrayList();   

        list.add(10);
        list.add("Hello");

        for (Object item : list) {
            System.out.println(item);
        }
    }
}
