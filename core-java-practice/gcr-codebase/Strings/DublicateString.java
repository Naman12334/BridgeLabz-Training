import java.util.*;
public class DublicateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String input = scanner.nextLine();
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for (char ch : input.toCharArray()) {
            seen.add(input.charAt(ch));
         
            
      
      
    }
        System.out.println("Duplicate characters: " + duplicates);
        scanner.close();
    }
    
}
