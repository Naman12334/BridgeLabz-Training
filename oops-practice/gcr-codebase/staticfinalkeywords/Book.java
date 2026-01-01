public class Book {

    private static String libName = "Egmore Library";

    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libName);
    }

    public void show() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        displayLibraryName();
        b.show();
    }
}
