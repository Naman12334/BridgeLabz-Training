import java.util.*;

public class Key {

    static boolean isAlpha(String s) {
        return s.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {

            String s = sc.nextLine();

            if (s.length() == 0) {
                System.out.println("Invalid Input (empty string)");
                continue;
            }

            if (s.length() < 6) {
                System.out.println("Invalid Input (length < 6)");
                continue;
            }

            if (s.contains(" ")) {
                System.out.println("Invalid Input (contains space)");
                continue;
            }

            if (!isAlpha(s)) {

                if (s.matches(".*\\d.*"))
                    System.out.println("Invalid Input (contains digits)");
                else
                    System.out.println("Invalid Input (contains special character)");

                continue;
            }

            s = s.toLowerCase();

            StringBuilder temp = new StringBuilder();

            for (char c : s.toCharArray())
                if ((int) c % 2 != 0)
                    temp.append(c);

            temp.reverse();

            for (int i = 0; i < temp.length(); i++)
                if (i % 2 == 0)
                    temp.setCharAt(i, Character.toUpperCase(temp.charAt(i)));

            System.out.println("The generated key is - " + temp);
        }
    }
}