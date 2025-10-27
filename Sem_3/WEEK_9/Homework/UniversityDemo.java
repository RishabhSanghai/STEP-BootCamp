class University {
    String uniName;

    University(String uniName) {
        this.uniName = uniName;
    }

    class Department {
        String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void showInfo() {
            System.out.println("University: " + uniName + ", Department: " + deptName);
        }
    }

    static class ExamCell {
        void conductExam() {
            System.out.println("ExamCell: Conducting exams...");
        }
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University uni = new University("MIT");
        University.Department dept = uni.new Department("CSE");
        dept.showInfo();

        University.ExamCell exam = new University.ExamCell();
        exam.conductExam();
    }
}
