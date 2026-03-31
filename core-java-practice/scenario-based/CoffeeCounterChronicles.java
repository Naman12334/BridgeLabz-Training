import java.util.*;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        while (true) {
          
            String c = sc.next();

            if (c.equals("exit")) {
                break;
            }

      
            int q = sc.nextInt();

            double p = 0;

            switch (c) {
                case "espresso":
                    p = 100;
                    break;
                case "latte":
                    p = 120;
                    break;
                case "cappuccino":
                    p = 150;
                    break;
                default:
                    System.out.println("invalid input");
                    continue;
            }

            double bill = p * q;
            double gst = bill * 0.05;
            double total = bill + gst;

            System.out.println("Bill: " + bill);
            System.out.println("GST: " + gst);
            System.out.println("Total: " + total);
        }
        
    }
    
}
