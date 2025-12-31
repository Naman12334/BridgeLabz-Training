class Student {
    public int roll;
    protected String name;
    private double cgpa;

    void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    double getCgpa() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {
    void show() {
        System.out.println(roll + " " + name);
    }
}
