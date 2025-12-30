class Item {
    String code;
    String name;
    double price;

    void show() {
        System.out.println("itemCode : " + code);
        System.out.println("itemPrice : " + price);
        System.out.println("itemName : " + name);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Item i1 = new Item();
        i1.code = "01AA";
        i1.price = 500.0;
        i1.name = "Water bottle";

        Item i2 = new Item();
        i2.code = "01BB";
        i2.price = 700.0;
        i2.name = "Rice";

        Item i3 = new Item();
        i3.code = "02AA";
        i3.price = 400.0;
        i3.name = "blackboard";

        i1.show();
        i2.show();
        i3.show();
    }
}
