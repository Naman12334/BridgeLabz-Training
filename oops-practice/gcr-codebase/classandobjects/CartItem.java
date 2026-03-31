class CartItem {
    String name;
    double price;
    int qty;

    void show() {
        System.out.println("Item: " + name + ", Price: $" + price + ", Quantity: " + qty);
    }

    void add(int q) {
        qty += q;
        System.out.println("Added " + q + " of " + name + " to the cart.");
    }

    void remove(int q) {
        qty -= q;
        if (qty < 0) qty = 0;
        System.out.print("Removed " + q + " of " + name + " from the cart.");
        System.out.println("Total cost: $" + (price * qty));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.name = "Laptop";
        c.price = 999.99;
        c.qty = 1;

        c.show();
        c.add(2);
        c.remove(1);
    }
}
