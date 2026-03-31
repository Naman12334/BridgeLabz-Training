import java.util.*;

public class CafeteriaApp {

    static void displayMenu(String[] m) {
        System.out.println("Cafeteria Menu:");
        for (int i = 0; i < m.length; i++)
            System.out.println(i + " : " + m[i]);
    }

    static String getItemByIndex(String[] m, int i) {
        if (i >= 0 && i < m.length)
            return m[i];
        return "Invalid Selection";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Sandwich", "Burger", "Pizza", "Pasta", "Noodles",
            "Coffee", "Tea", "Juice", "Fries", "Ice Cream"
        };

        displayMenu(menu);

        System.out.print("Enter item index: ");
        int i = sc.nextInt();

        String item = getItemByIndex(menu, i);
        System.out.println("You selected: " + item);
    }
}
