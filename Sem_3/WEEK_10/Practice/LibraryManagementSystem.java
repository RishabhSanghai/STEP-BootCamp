import java.util.*;

// ==================== CLASS: Book ====================
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void showDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

    public String getTitle() {
        return title;
    }
}

// ==================== CLASS: Library ====================
class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book '" + book.getTitle() + "' to " + name + " Library");
    }

    public void showBooks() {
        System.out.println("\nBooks in " + name + " Library:");
        for (Book b : books) {
            b.showDetails();
        }
    }
}

// ==================== CLASS: Member ====================
class Member {
    private String name;
    private List<Book> borrowedBooks;

    public Member(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " borrowed book: " + book.getTitle());
    }

    public void showBorrowedBooks() {
        System.out.println("\nBooks borrowed by " + name + ":");
        for (Book b : borrowedBooks) {
            b.showDetails();
        }
    }
}

// ==================== CLASS: LibraryDemo (Main) ====================
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Step 1 - Create a Library
        Library lib = new Library("Central City");

        // Step 2 - Create 3 Books
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN101");
        Book b2 = new Book("Harry Potter", "J.K. Rowling", "ISBN102");
        Book b3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "ISBN103");

        // Step 3 - Add books to Library
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        // Step 4 - Display all books
        lib.showBooks();

        // Step 5 - Create a Member
        Member m1 = new Member("Ravi");

        // Step 6 - Borrow 2 books
        m1.borrowBook(b1);
        m1.borrowBook(b3);

        // Step 7 - Show borrowed books
        m1.showBorrowedBooks();
    }
}
