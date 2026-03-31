class Product {
    String name;
    double price;
    static int total = 0;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        total++;
    }

    void display() {
        System.out.println(name + " ₹" + price);
    }

    static void showTotal() {
        System.out.println("Total Products: " + total);
    }
}
