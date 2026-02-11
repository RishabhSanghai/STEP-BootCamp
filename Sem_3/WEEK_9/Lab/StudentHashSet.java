import java.util.*;

class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return id == s.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + "]";
    }
}

public class StudentHashSet {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student(1, "Riya"));
        set.add(new Student(2, "Karan"));
        set.add(new Student(1, "Riya"));

        for (Student s : set)
            System.out.println(s);
    }
}
