class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Not available");
        }
    }
}
