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

    public void add(int q) {
        qty += q;
    }

    public void remove(int q) throws OutOfStockException {
        if (q > qty)
            throw new OutOfStockException("Out of stock: " + name);
        qty -= q;
    }
}

// alert interface
interface AlertService {
    void alert(Product p);
}

// low stock alert
class LowStockAlert implements AlertService {
    public void alert(Product p) {
        System.out.println("⚠ LOW STOCK ALERT: " + p.name + " | Qty: " + p.qty);
    }
}

// inventory class
class Inventory {
    Product[] arr;
    int size = 0;
    final int LIMIT = 5;
    AlertService as = new LowStockAlert();

    public Inventory(int cap) {
        arr = new Product[cap];
    }

    public void addProduct(Product p) {
        arr[size++] = p;
    }

    private Product find(int id) {
        for (int i = 0; i < size; i++) {
            if (arr[i].id == id)
                return arr[i];
        }
        return null;
    }

    public void update(int id, int q) throws OutOfStockException {
        Product p = find(id);
        if (p == null) {
            System.out.println("Product not found");
            return;
        }

        if (q < 0)
            p.remove(-q);
        else
            p.add(q);

        if (p.qty <= LIMIT)
            as.alert(p);
    }

    public void show() {
        System.out.println("\n--- Inventory ---");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].id + " | " + arr[i].name + " | Qty: " + arr[i].qty);
        }
    }
}

// main class
public class InventoryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        Inventory inv = new Inventory(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter id, name, qty: ");
            int id = sc.nextInt();
            String name = sc.next();
            int qty = sc.nextInt();

            inv.addProduct(new Product(id, name, qty));
        }

        try {
            System.out.print("\nEnter product id to update: ");
            int id = sc.nextInt();

            System.out.print("Enter qty (+add / -remove): ");
            int q = sc.nextInt();

            inv.update(id, q);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }

        inv.show();
        sc.close();
    }
}
