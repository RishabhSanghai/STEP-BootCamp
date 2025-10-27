import java.util.*;

class Student {
    private int rollNo;
    private String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return rollNo == s.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return "Student[RollNo=" + rollNo + ", Name=" + name + "]";
    }
}

public class StudentHashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student(1, "Riya"));
        set.add(new Student(2, "Karan"));
        set.add(new Student(1, "Riya"));

        for (Student s : set)
            System.out.println(s);
    }
}
