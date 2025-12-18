import java.util.*;

public class Quantity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int quantity = sc.nextInt();
        int total = price * quantity;
        System.out.println("The total purchase price is INR" + total + " ___ if the quantity ___" + quantity + "and unit price is INR ___" + price);
        
    }
    
}
