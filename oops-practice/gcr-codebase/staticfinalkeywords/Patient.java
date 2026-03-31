public class Patient {

    private static String hosp = "City Hospital";
    private static int cnt = 0;

    private final String pid;
    private String name;
    private int age;
    private String ail;

    public Patient(String pid, String name, int age, String ail) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.ail = ail;
        cnt++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + cnt);
    }

    public void show() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hosp);
            System.out.println("Patient ID: " + pid);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ail);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("P001", "Lathika", 30, "Flu");
        Patient p2 = new Patient("P002", "Lidiya", 45, "Fracture");

        getTotalPatients();
        p1.show();
        p2.show();
    }
}
