class TaskNode {
    int id, pr;
    String name, due;
    TaskNode next;

    TaskNode(int i, String n, int p, String d) {
        id = i;
        name = n;
        pr = p;
        due = d;
    }
}

class TaskList {
    TaskNode head;

    void add(TaskNode n) {
        if (head == null) {
            head = n;
            n.next = head;
            return;
        }
        TaskNode t = head;
        while (t.next != head) t = t.next;
        t.next = n;
        n.next = head;
    }

    void remove(int id) {
        if (head == null) return;
        TaskNode cur = head, prev = null;
        do {
            if (cur.id == id) {
                if (prev != null) prev.next = cur.next;
                if (cur == head) head = cur.next;
                return;
            }
            prev = cur;
            cur = cur.next;
        } while (cur != head);
    }

    void display() {
        if (head == null) return;
        TaskNode t = head;
        do {
            System.out.println(t.id + " " + t.name);
            t = t.next;
        } while (t != head);
    }
}
