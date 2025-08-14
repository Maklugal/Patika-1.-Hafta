package Patika_4_Week.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    /**
     * Add a book to the library
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());

    }

    /**
     * List all books
     */
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.printf("%d) %s%n", i + 1, books.get(i));
        }
    }

    /**
     * Search for a book by title (case-insensitive)
     */
    public Book searchBook(String title) {
        if (title == null) return null;
        String searchTitle = title.trim();
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(searchTitle)) {
                return b;
            }
        }
        return null;
    }

    /**
     * Borrow a book by title
     */
    public void borrowBook(String title) {
        Book book = searchBook(title);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (book.borrow()) {
            System.out.println("You borrowed: " + book.getTitle());
        } else {
            System.out.println("This book is already borrowed.");
        }
    }

    /**
     * Return a book by title
     */
    public void returnBook(String title) {
        Book book = searchBook(title);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (book.returnBook()) {
            System.out.println("You returned: " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed.");
        }
    }
}
