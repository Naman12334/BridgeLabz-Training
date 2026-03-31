public class Employee {

    private static String comp = "Tech Solutions Inc.";
    private static int cnt = 0;

    private final int id;
    private String name;
    private String desig;

    public Employee(int id, String name, String desig) {
        this.id = id;
        this.name = name;
        this.desig = desig;
        cnt++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + cnt);
    }

    public void show() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + comp);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + desig);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Thamarai", "Software Engineer");
        Employee e2 = new Employee(102, "Rohan", "Project Manager");

        displayTotalEmployees();
        e1.show();
        e2.show();
    }
}
