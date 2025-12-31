class Book2 {
    public String isbn;
    protected String title;
    private String author;

    void setAuthor(String author) {
        this.author = author;
    }

    String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    void display() {
        System.out.println(isbn + " " + title);
    }
}
