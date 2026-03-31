// Category marker interfaces
interface BookCategory {}
interface ClothingCategory {}
interface GadgetCategory {}

// Generic Product class
class Product<T> {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " Price: " + price);
    }
}

// Utility class with generic method
class DiscountUtil {
    static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price -= product.price * (percentage / 100);
    }
}

// Main class
public class MarketplaceDemo {
    public static void main(String[] args) {
        Product<BookCategory> book =
                new Product<>("Java Programming", 500);

        DiscountUtil.applyDiscount(book, 10);
        book.display();
    }
}
