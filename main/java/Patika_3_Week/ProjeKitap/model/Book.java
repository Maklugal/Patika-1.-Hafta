package Patika_3_Week.ProjeKitap.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Book extends Product {
    private final Author author;
    private final LocalDate publishedDate;
    private final LocalDateTime createDate;


    public Book(String name, double price, Author author, LocalDate publishedDate) {
        super(name, price);
        this.author = author;
        this.publishedDate = publishedDate;
        this.createDate = LocalDateTime.now();
    }

    public Author getAuthor() {
        return author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "Book{" + " name= " + getName() +
                ", price =" + getPrice() +
                ", author=" + author +
                ", publishedDate=" + publishedDate +
                ", createDate=" + createDate +
                '}';
    }
}

