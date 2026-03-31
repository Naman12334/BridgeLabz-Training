public class Vehicle {

    private static double fee = 150;

    private final String regNo;
    private String owner;
    private String type;

    public Vehicle(String owner, String type, String regNo) {
        this.owner = owner;
        this.type = type;
        this.regNo = regNo;
    }

    public void show() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + owner);
            System.out.println("Vehicle Type: " + type);
            System.out.println("Registration Number: " + regNo);
            System.out.println("Registration Fee: $" + fee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Price danish", "SUV", "XYZ789");

        v1.show();
        v2.show();
    }
}
