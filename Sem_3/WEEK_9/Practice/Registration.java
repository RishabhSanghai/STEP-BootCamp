// File: Registration.java
class ContactInfo implements Cloneable {
    String email, phone;

    public ContactInfo(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    @Override
    public String toString() {
        return email + ", " + phone;
    }
}

class Student implements Cloneable {
    String id, name;
    ContactInfo contact;

    public Student(String id, String name, ContactInfo contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    // Shallow clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep clone
    public Student deepClone() throws CloneNotSupportedException {
        Student s = (Student) super.clone();
        s.contact = (ContactInfo) contact.clone();
        return s;
    }

    @Override
    public String toString() {
        return id + " - " + name + " | " + contact;
    }
}

public class Registration {
    public static void main(String[] args) throws CloneNotSupportedException {
        ContactInfo c1 = new ContactInfo("stud@gmail.com", "9999999999");
        Student s1 = new Student("S101", "Arjun", c1);

        Student shallow = (Student) s1.clone();
        Student deep = s1.deepClone();

        shallow.contact.email = "changed@x.com";
        System.out.println("Original: " + s1);
        System.out.println("Shallow:  " + shallow);
        System.out.println("Deep:     " + deep);
    }
}
