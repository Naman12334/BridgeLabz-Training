class Employee {
    public int id;
    protected String dept;
    private double sal;

    void setSalary(double sal) {
        this.sal = sal;
    }

    double getSalary() {
        return sal;
    }
}

class Manager extends Employee {
    void display() {
        System.out.println(id + " " + dept);
    }
}
