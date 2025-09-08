import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Book class
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | ISBN: " + isbn;
    }
}

// Library class
class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    // Search by Title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) System.out.println("No book found with title: " + title);
    }

    // Search by Author
    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) System.out.println("No book found by author: " + author);
    }

    // Search by ISBN
    public void searchByISBN(String isbn) {
        boolean found = false;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) System.out.println("No book found with ISBN: " + isbn);
    }
}

// Main class (must match filename)
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Adding some sample books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "12345"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "67890"));
        library.addBook(new Book("Java Programming", "James Gosling", "11111"));

        int choice;
        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Search by Title");
            System.out.println("2. Search by Author");
            System.out.println("3. Search by ISBN");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    library.searchByTitle(title);
                    break;

                case 2:
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    library.searchByAuthor(author);
                    break;

                case 3:
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    library.searchByISBN(isbn);
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}