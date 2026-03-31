import java.util.*;
public class LexographicCompareOFStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int result = str1.compareTo(str2);

        if (result < 0) {
            System.out.println("\"" + str1 + "\" is lexicographically smaller than \"" + str2 + "\"");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\"");
        } else {
            System.out.println("Both strings are equal lexicographically.");
        }
    }
    
}
