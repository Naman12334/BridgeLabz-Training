class Vehicle {
    String owner;
    String type;
    static double fee = 5000;

    Vehicle(String owner, String type) {
        this.owner = owner;
        this.type = type;
    }

    void display() {
        System.out.println(owner + " owns " + type);
    }

    static void updateFee(double f) {
        fee = f;
    }
}
