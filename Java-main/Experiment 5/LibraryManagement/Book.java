package LibraryManagement;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return isbn; }

    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", ISBN: " + isbn + "]";
    }
}
