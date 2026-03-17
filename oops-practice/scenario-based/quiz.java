import java.util.*;
import java.lang.Math;

class Student {
    String name, dept;
    int q1, q2, q3;

    Student(String n, String d, int a, int b, int c) {
        name = n;
        dept = d;
        q1 = a;
        q2 = b;
        q3 = c;
    }

    int total() {
        return q1 + q2 + q3;
    }
}

public class quiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> list = new ArrayList<>();

        while (n-- > 0) {

            String line = sc.nextLine();
            String[] p = line.split(" ");

            if (p[0].equals("Record")) {

                Student s = new Student(
                        p[1],
                        p[2],
                        Integer.parseInt(p[3]),
                        Integer.parseInt(p[4]),
                        Integer.parseInt(p[5]));

                list.add(s);

                System.out.println("Record Added: " + s.name);
            }

            else if (p[0].equals("Top")) {

                if (list.isEmpty()) {
                    System.out.println("No Records Available");
                    continue;
                }

                String key = p[1];

                if (key.equals("Q1") || key.equals("Q2") || key.equals("Q3")) {

                    int max = -1;

                    for (Student s : list) {
                        int score =
                                key.equals("Q1") ? s.q1 :
                                key.equals("Q2") ? s.q2 : s.q3;

                        max = Math.max(max, score);
                    }

                    for (Student s : list) {
                        int score =
                                key.equals("Q1") ? s.q1 :
                                key.equals("Q2") ? s.q2 : s.q3;

                        if (score == max)
                            System.out.println(s.name + " " + score);
                    }
                }

                else {

                    int max = -1;
                    boolean found = false;

                    for (Student s : list)
                        if (s.dept.equals(key)) {
                            max = Math.max(max, s.total());
                            found = true;
                        }

                    if (!found) {
                        System.out.println("Department Not Found");
                        continue;
                    }

                    for (Student s : list)
                        if (s.dept.equals(key) && s.total() == max)
                            System.out.println(s.name + " " + s.total());
                }
            }
        }
    }
}