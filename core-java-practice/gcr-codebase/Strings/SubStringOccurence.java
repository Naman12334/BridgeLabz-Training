import java.util.*;
public class SubStringOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mainString = scanner.nextLine();
        String subString = scanner.nextLine();
        int count = 0;
        int index = 0;
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }

        System.out.println("Number of occurrences: " + count);
      
    }
    
}
