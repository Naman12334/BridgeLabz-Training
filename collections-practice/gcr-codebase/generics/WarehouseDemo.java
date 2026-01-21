import java.util.*;

// Abstract base class
abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    abstract void display();
}

// Subclasses
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }

    void display() {
        System.out.println("Electronics Item: " + name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }

    void display() {
        System.out.println("Grocery Item: " + name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }

    void display() {
        System.out.println("Furniture Item: " + name);
    }
}


class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}


class WarehouseUtil {
    static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.display();
        }
    }
}


public class WarehouseDemo {
    public static void main(String[] args) {
        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(new Electronics("Laptop"));
        electronics.addItem(new Electronics("Mobile"));

        WarehouseUtil.displayItems(electronics.getItems());
    }
}
