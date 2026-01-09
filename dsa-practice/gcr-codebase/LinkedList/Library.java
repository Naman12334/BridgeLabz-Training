class BookNode {
    int id;
    String title, auth, gen;
    boolean avail;
    BookNode prev, next;

    BookNode(int i, String t, String a, String g, boolean v) {
        id = i;
        title = t;
        auth = a;
        gen = g;
        avail = v;
    }
}

class Library {
    BookNode head, tail;

    void add(BookNode n) {
        if (head == null) head = tail = n;
        else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    int count() {
        int c = 0;
        for (BookNode t = head; t != null; t = t.next) c++;
        return c;
    }
}
