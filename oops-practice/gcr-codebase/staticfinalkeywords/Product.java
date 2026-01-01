public class Product {

    private static double disc = 10;

    private final String pid;
    private String name;
    private double price;
    private int qty;

    public Product(String pid, String name, double price, int qty) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public static void updateDiscount(double d) {
        disc = d;
    }

    public void show() {
        if (this instanceof Product) {
            double finalPrice = price - (price * disc / 100);
            System.out.println("Product ID: " + pid);
            System.out.println("Product Name: " + name);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + qty);
            System.out.println("Discount: " + disc + "%");
            System.out.println("Price after Discount: $" + finalPrice);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 1200, 5);
        Product p2 = new Product("P002", "Smartphone", 800, 10);

        p1.show();
        p2.show();
    }
}
