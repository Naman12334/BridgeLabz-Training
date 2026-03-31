import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)   
@interface AuthorAttribute {
    String name();
}


@AuthorAttribute(name = "Harsh")
class Book {
}


public class RetrieveAttributesAtRuntime {
    public static void main(String[] args) {

       
        AuthorAttribute attr =
                Book.class.getAnnotation(AuthorAttribute.class);

       
        System.out.println(attr.name());
    }
}
