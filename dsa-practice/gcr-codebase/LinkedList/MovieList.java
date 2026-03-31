class MovieNode {
    String title, dir;
    int year;
    double rate;
    MovieNode prev, next;

    MovieNode(String t, String d, int y, double r) {
        title = t;
        dir = d;
        year = y;
        rate = r;
    }
}

class MovieList {
    MovieNode head, tail;

    void addLast(MovieNode n) {
        if (head == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    void remove(String title) {
        MovieNode t = head;
        while (t != null) {
            if (t.title.equals(title)) {
                if (t == head) head = t.next;
                if (t == tail) tail = t.prev;
                if (t.prev != null) t.prev.next = t.next;
                if (t.next != null) t.next.prev = t.prev;
                return;
            }
            t = t.next;
        }
    }

    void displayForward() {
        for (MovieNode t = head; t != null; t = t.next)
            System.out.println(t.title + " " + t.rate);
    }

    void displayReverse() {
        for (MovieNode t = tail; t != null; t = t.prev)
            System.out.println(t.title + " " + t.rate);
    }

    void updateRate(String title, double r) {
        MovieNode t = head;
        while (t != null) {
            if (t.title.equals(title)) {
                t.rate = r;
                return;
            }
            t = t.next;
        }
    }
}
