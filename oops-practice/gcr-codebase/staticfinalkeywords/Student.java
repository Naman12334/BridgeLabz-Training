public class Student {

    private static String uni = "Global University";
    private static int cnt = 0;

    private final int roll;
    private String name;
    private char grade;

    public Student(int roll, String name, char grade) {
        this.roll = roll;
        this.name = name;
        this.grade = grade;
        cnt++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + cnt);
    }

    public void updateGrade(char g) {
        if (this instanceof Student) {
            grade = g;
            System.out.println("Grade updated to: " + grade);
        }
    }

    public void show() {
        System.out.println("University Name: " + uni);
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Hemashree", 'A');
        Student s2 = new Student(102, "Sharmila", 'B');

        displayTotalStudents();
        s1.show();
        s2.show();

        s2.updateGrade('A');
        s2.show();
    }
}
