class StateNode {
    String text;
    StateNode prev, next;

    StateNode(String t) { text = t; }
}

class Editor {
    StateNode cur;

    void add(String t) {
        StateNode n = new StateNode(t);
        if (cur != null) {
            cur.next = n;
            n.prev = cur;
        }
        cur = n;
    }

    void undo() {
        if (cur != null && cur.prev != null)
            cur = cur.prev;
    }

    void redo() {
        if (cur != null && cur.next != null)
            cur = cur.next;
    }
}
