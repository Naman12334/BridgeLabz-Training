class MovieTicket {
    String movie, seat;
    double price;
    boolean booked = false;

    void book(String m, String s, double p) {
        if (booked) {
            System.out.println("House full!!! sorry..... Ticket already booked");
            return;
        }
        movie = m;
        seat = s;
        price = p;
        booked = true;
        System.out.println("Ticket booked for movie: " + movie);
        System.out.println("Seat Number: " + seat);
    }

    void show() {
        if (!booked)
            System.out.println("Ticket have not booked yet....");
        else
            System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();

        t.show();
        t.book("Dragon", "A10", 120);
        t.book("Dragon", "A10", 120);
        t.book("Dragon", "A10", 120);
        t.show();

        System.out.println();
        MovieTicket t2 = new MovieTicket();
        t2.book("Dragon", "A10", 120);
        t2.show();
    }
}
