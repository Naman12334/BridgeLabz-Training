import java.util.*;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                result.append(s.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
    
}
