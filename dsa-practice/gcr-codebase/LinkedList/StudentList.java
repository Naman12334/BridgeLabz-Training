class StudentNode {
    int roll, age;
    String name, grade;
    StudentNode next;

    StudentNode(int r, String n, int a, String g) {
        roll = r;
        name = n;
        age = a;
        grade = g;
        next = null;
    }
}

class StudentList {
    StudentNode head;

    void addFirst(StudentNode n) {
        n.next = head;
        head = n;
    }

    void addLast(StudentNode n) {
        if (head == null) {
            head = n;
            return;
        }
        StudentNode t = head;
        while (t.next != null) t = t.next;
        t.next = n;
    }

    void delete(int roll) {
        if (head == null) return;
        if (head.roll == roll) {
            head = head.next;
            return;
        }
        StudentNode t = head;
        while (t.next != null && t.next.roll != roll)
            t = t.next;
        if (t.next != null)
            t.next = t.next.next;
    }

    void search(int roll) {
        StudentNode t = head;
        while (t != null) {
            if (t.roll == roll) {
                System.out.println(t.name + " " + t.grade);
                return;
            }
            t = t.next;
        }
        System.out.println("Not Found");
    }

    void updateGrade(int roll, String g) {
        StudentNode t = head;
        while (t != null) {
            if (t.roll == roll) {
                t.grade = g;
                return;
            }
            t = t.next;
        }
    }

    void display() {
        StudentNode t = head;
        while (t != null) {
            System.out.println(t.roll + " " + t.name + " " + t.grade);
            t = t.next;
        }
    }
}
