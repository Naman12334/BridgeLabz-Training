import java.util.*;
public class CountVowelsAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int vowelCount = countVowels(input);
        int stringCount = countStrings(input);
        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of strings (words): " + stringCount);
        
        scanner.close();
    }
    
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        
        return count;
    }
    
    public static int countStrings(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}