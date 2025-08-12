package Patika_4_Week.LibraryManagementSystem;

import java.util.Objects;

public class Book {
    private final String title;
    private final String author;
    private final int year;
    private boolean isBorrowed;

    public Book(String title, String author, int year) {
        this.title = Objects.requireNonNull(title, "title cannot be null").trim();
        this.author = Objects.requireNonNull(author, "author cannot be null").trim();
        if (year <= 0) throw new IllegalArgumentException("year must be positive");
        this.year = year;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    /**
     * Borrow the book. Returns true if successful.
     */
    public boolean borrow() {
        if (isBorrowed) return false;
        isBorrowed = true;
        return true;
    }

    /**
     * Return the book. Returns true if successful.
     */
    public boolean returnBook() {
        if (!isBorrowed) return false;
        isBorrowed = false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s', year=%d, borrowed=%s}",
                title, author, year, isBorrowed ? "yes" : "no");
    }

    /**
     * Equality based on title + author + year
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book b)) return false;
        return year == b.year
                && title.equalsIgnoreCase(b.title)
                && author.equalsIgnoreCase(b.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase(), year);
    }
}
