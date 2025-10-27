import java.util.*;

class Book implements Cloneable {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Book[Title=" + title + "]";
    }
}

class Library implements Cloneable {
    List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    protected Library shallowClone() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    protected Library deepClone() throws CloneNotSupportedException {
        List<Book> clonedBooks = new ArrayList<>();
        for (Book b : books)
            clonedBooks.add((Book) b.clone());
        return new Library(clonedBooks);
    }

    @Override
    public String toString() {
        return "Library" + books;
    }
}

public class LibraryClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Java"));
        bookList.add(new Book("Python"));

        Library lib1 = new Library(bookList);
        Library shallow = lib1.shallowClone();
        Library deep = lib1.deepClone();

        shallow.books.get(0).title = "C++";

        System.out.println("Original Library: " + lib1);
        System.out.println("Shallow Clone: " + shallow);
        System.out.println("Deep Clone: " + deep);
    }
}
