class Course {
    String cname;
    int dur;
    double fee;
    static String inst = "ABC Institute";

    Course(String cname, int dur, double fee) {
        this.cname = cname;
        this.dur = dur;
        this.fee = fee;
    }

    void display() {
        System.out.println(cname + " | " + dur + " weeks | ₹" + fee);
    }

    static void updateInstitute(String name) {
        inst = name;
    }
}
