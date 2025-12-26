import java.util.*;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String wordToReplace = scanner.next();
        String replacementWord = scanner.next();

        String resultString = inputString.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
        System.out.println(resultString);
    }
    
}
