class LibraryUser {
    String name;
    LibraryUser(String name) { this.name = name; }
    void access() { System.out.println(name + " can enter the library."); }
}

class Student extends LibraryUser {
    Student(String name) { super(name); }
    void borrowBooks() { System.out.println(name + " borrows books and uses computers."); }
}

class Faculty extends LibraryUser {
    Faculty(String name) { super(name); }
    void reserveBooks() { System.out.println(name + " reserves books and accesses research DB."); }
}

class Guest extends LibraryUser {
    Guest(String name) { super(name); }
    void browseBooks() { System.out.println(name + " only browses books."); }
}

public class UniversityLibrarySystem {
    public static void main(String[] args) {
        LibraryUser u1 = new Student("Alice");   // Upcasting
        LibraryUser u2 = new Faculty("Bob");
        LibraryUser u3 = new Guest("Charlie");

        u1.access();
        u2.access();
        u3.access();
    }
}
