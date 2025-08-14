package Patika_4_Week.LibraryManagementSystem;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Sample data
        library.addBook(new Book("Clean Code", "Robert C. Martin", 2008));
        library.addBook(new Book("Effective Java", "Joshua Bloch", 2018));
        library.addBook(new Book("Design Patterns", "GoF", 1994));


        while (true) {
            System.out.println("\n==== Library Management System ====");
            System.out.println("1) Add a Book");
            System.out.println("2) List All Books");
            System.out.println("3) Search by Title");
            System.out.println("4) Borrow a Book");
            System.out.println("5) Return a Book");
            System.out.println("6) Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Year: ");
                    int year;
                    try {
                        year = Integer.parseInt(sc.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid year!");
                        break;
                    }
                    library.addBook(new Book(title, author, year));
                    break;

                case "2":
                    library.listBooks();
                    break;

                case "3":
                    System.out.print("Enter title to search: ");
                    Book found = library.searchBook(sc.nextLine());
                    System.out.println(found != null ? found : "Book not found.");
                    break;

                case "4":
                    System.out.print("Enter title to borrow: ");
                    library.borrowBook(sc.nextLine());
                    break;

                case "5":
                    System.out.print("Enter title to return: ");
                    library.returnBook(sc.nextLine());
                    break;

                case "6":
                    System.out.println("Exiting the program. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
