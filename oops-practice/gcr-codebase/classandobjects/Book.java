class Book {
    String title;
    String auth;
    double price;

    void show() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + auth);
        System.out.println("Price of the book: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "2States";
        b1.auth = "Chetan Bhagat";
        b1.price = 500.0;

        Book b2 = new Book();
        b2.title = "Wings Of Fire";
        b2.auth = "Abdul kalam.A.P.J";
        b2.price = 500.0;

        b1.show();
        b2.show();
    }
}
