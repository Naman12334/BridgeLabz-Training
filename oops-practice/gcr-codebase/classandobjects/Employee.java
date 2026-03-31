class Employee {
    String name;
    int id;
    double sal;

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + sal);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Rohan";
        e.id = 1;
        e.sal = 500000;

        e.display();
    }
}
