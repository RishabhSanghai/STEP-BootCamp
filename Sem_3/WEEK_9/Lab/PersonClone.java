class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    protected Person shallowClone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    protected Person deepClone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) address.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Person[Name=" + name + ", City=" + address.city + "]";
    }
}

public class PersonClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Amit", new Address("Delhi"));
        Person shallow = p1.shallowClone();
        Person deep = p1.deepClone();

        p1.address.city = "Mumbai";

        System.out.println("Original: " + p1);
        System.out.println("Shallow Copy: " + shallow);
        System.out.println("Deep Copy: " + deep);
    }
}
