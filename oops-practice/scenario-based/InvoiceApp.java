import java.util.*;

public class InvoiceApp {

    static int[] parseInvoice(String s) {
        String[] parts = s.split(",");
        int[] amt = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            String[] p = parts[i].split("-");
            String a = p[1].replaceAll("[^0-9]", "");
            amt[i] = Integer.parseInt(a);
            System.out.println("Task: " + p[0].trim() + " | Amount: " + amt[i]);
        }
        return amt;
    }

    static int getTotalAmount(int[] a) {
        int sum = 0;
        for (int x : a)
            sum += x;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter invoice details:");
        String s = sc.nextLine();

        int[] a = parseInvoice(s);
        int total = getTotalAmount(a);

        System.out.println("Total Invoice Amount = " + total + " INR");
    }
}
