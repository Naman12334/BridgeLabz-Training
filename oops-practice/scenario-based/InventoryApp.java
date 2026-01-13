import java.util.*;

// custom exception
class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}

// product class
class Product {
    int id;
    String name;
    int qty;

    public Product(int id, String name, int qty) {
        this.id = id;
        this.name = name;
        this.qty = qty;
    }

    public void addStock(int q) {
        qty += q;
    }

    public void reduceStock(int q) throws OutOfStockException {
        if (q > qty)
            throw new OutOfStockException("Out of stock: " + name);
        qty -= q;
    }
}

// interface for alerts
interface AlertService {
    void sendAlert(Product p);
}

// low stock alert implementation
class LowStockAlert implements AlertService {
    public void sendAlert(Product p) {
        System.out.println("⚠ LOW STOCK ALERT: " + p.name + " | Qty: " + p.qty);
    }
}

// inventory class
class Inventory {
    Map<Integer, Product> map = new HashMap<>();
    AlertService alert = new LowStockAlert();
    final int LIMIT = 5;

    public void addProduct(Product p) {
        map.put(p.id, p);
    }

    public void updateStock(int id, int q) throws OutOfStockException {
        Product p = map.get(id);
        if (p == null)
            return;

        if (q < 0)
            p.reduceStock(-q);
        else
            p.addStock(q);

        if (p.qty <= LIMIT)
            alert.sendAlert(p);
    }

    public void showStock() {
        for (Product p : map.values()) {
            System.out.println(p.id + " | " + p.name + " | Qty: " + p.qty);
        }
    }
}

// main class
public class InventoryApp {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addProduct(new Product(1, "Laptop", 10));
        inv.addProduct(new Product(2, "Mouse", 4));

        try {
            inv.updateStock(1, -3);
            inv.updateStock(2, -2);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }

        inv.showStock();
    }
}
