class ItemNode {
    int id, qty;
    String name;
    double price;
    ItemNode next;

    ItemNode(int i, String n, int q, double p) {
        id = i;
        name = n;
        qty = q;
        price = p;
    }
}

class Inventory {
    ItemNode head;

    void add(ItemNode n) {
        n.next = head;
        head = n;
    }

    void updateQty(int id, int q) {
        for (ItemNode t = head; t != null; t = t.next)
            if (t.id == id) t.qty = q;
    }

    double totalValue() {
        double sum = 0;
        for (ItemNode t = head; t != null; t = t.next)
            sum += t.qty * t.price;
        return sum;
    }
}
