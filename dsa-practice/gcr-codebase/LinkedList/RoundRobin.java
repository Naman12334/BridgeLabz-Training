class ProcNode {
    int id, bt;
    ProcNode next;

    ProcNode(int i, int b) {
        id = i;
        bt = b;
    }
}

class RoundRobin {
    ProcNode head;

    void add(ProcNode n) {
        if (head == null) {
            head = n;
            n.next = head;
            return;
        }
        ProcNode t = head;
        while (t.next != head) t = t.next;
        t.next = n;
        n.next = head;
    }
}
