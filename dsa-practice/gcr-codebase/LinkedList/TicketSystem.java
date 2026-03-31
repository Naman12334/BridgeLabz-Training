class TicketNode {
    int id;
    String cust, movie, seat;
    TicketNode next;

    TicketNode(int i, String c, String m, String s) {
        id = i;
        cust = c;
        movie = m;
        seat = s;
    }
}

class TicketSystem {
    TicketNode head;

    void add(TicketNode n) {
        if (head == null) {
            head = n;
            n.next = head;
            return;
        }
        TicketNode t = head;
        while (t.next != head) t = t.next;
        t.next = n;
        n.next = head;
    }

    int count() {
        if (head == null) return 0;
        int c = 0;
        TicketNode t = head;
        do {
            c++;
            t = t.next;
        } while (t != head);
        return c;
    }
}
