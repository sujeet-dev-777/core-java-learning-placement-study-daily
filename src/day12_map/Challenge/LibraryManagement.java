package day12_map.Challenge;

import java.util.HashMap;
import java.util.Map;

class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean available;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Map<Integer, Book> library = new HashMap<>();

        library.put(101, new Book(101, "Clean Code", "Robert Martin"));

        library.put(102, new Book(102, "Effective Java", "Joshua Bloch"));

        library.put(103, new Book(103, "Head First Java", "Kathy Sierra"));

        System.out.println("=== Library Books ===");

        displayBooks(library);

        borrowBook(library, 102);

        System.out.println("=== After Borrowing Book 102 ===");

        displayBooks(library);

        returnBook(library, 102);

        System.out.println("=== After Returning Book 102 ===");

        displayBooks(library);
    }

    public static void borrowBook(Map<Integer, Book> library, int bookId) {

        if (!library.containsKey(bookId)) {

            System.out.println("Book Not Found");
            return;
        }

        Book book = library.get(bookId);

        if (book.isAvailable()) {

            book.borrowBook();

            System.out.println("Book Borrowed: " + book.getTitle());

        } else {

            System.out.println("Book is already borrowed");
        }
    }

    public static void returnBook(Map<Integer, Book> library, int bookId) {

        if (!library.containsKey(bookId)) {

            System.out.println("Book Not Found");
            return;
        }

        Book book = library.get(bookId);

        book.returnBook();

        System.out.println("Book Returned: " + book.getTitle());
    }

    public static void displayBooks(Map<Integer, Book> library) {

        for (Map.Entry<Integer, Book> entry : library.entrySet()) {

            Book book = entry.getValue();

            System.out.println(book.getBookId() + " | " + book.getTitle() + " | " + book.getAuthor() + " | Available: " + book.isAvailable());
        }
    }
}