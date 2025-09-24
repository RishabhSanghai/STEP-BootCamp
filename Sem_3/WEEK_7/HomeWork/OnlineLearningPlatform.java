class Course {
    String title, instructor, enrollmentDate;
    Course(String title, String instructor, String enrollmentDate) {
        this.title = title; this.instructor = instructor; this.enrollmentDate = enrollmentDate;
    }
    void displayProgress() {
        System.out.println(title + " by " + instructor + ", enrolled on " + enrollmentDate);
    }
}

class VideoCourse extends Course {
    int completionPercentage;
    double watchTime;
    VideoCourse(String title, String instructor, String enrollmentDate, int completionPercentage, double watchTime) {
        super(title, instructor, enrollmentDate);
        this.completionPercentage = completionPercentage;
        this.watchTime = watchTime;
    }
    @Override
    void displayProgress() {
        System.out.println("Video Course: " + title + ", Completion: " + completionPercentage + "%, Watch Time: " + watchTime + " hours");
    }
}

class InteractiveCourse extends Course {
    int quizScore, projectsCompleted;
    InteractiveCourse(String title, String instructor, String enrollmentDate, int quizScore, int projectsCompleted) {
        super(title, instructor, enrollmentDate);
        this.quizScore = quizScore; this.projectsCompleted = projectsCompleted;
    }
    @Override
    void displayProgress() {
        System.out.println("Interactive Course: " + title + ", Quiz Score: " + quizScore + ", Projects Completed: " + projectsCompleted);
    }
}

class ReadingCourse extends Course {
    int pagesRead;
    double notesProgress;
    ReadingCourse(String title, String instructor, String enrollmentDate, int pagesRead, double notesProgress) {
        super(title, instructor, enrollmentDate);
        this.pagesRead = pagesRead; this.notesProgress = notesProgress;
    }
    @Override
    void displayProgress() {
        System.out.println("Reading Course: " + title + ", Pages Read: " + pagesRead + ", Notes Progress: " + notesProgress + "%");
    }
}

class CertificationCourse extends Course {
    int examAttempts;
    boolean certified;
    CertificationCourse(String title, String instructor, String enrollmentDate, int examAttempts, boolean certified) {
        super(title, instructor, enrollmentDate);
        this.examAttempts = examAttempts; this.certified = certified;
    }
    @Override
    void displayProgress() {
        System.out.println("Certification Course: " + title + ", Exam Attempts: " + examAttempts + ", Certified: " + certified);
    }
}

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        Course c1 = new VideoCourse("Java Basics", "Alice", "2025-09-24", 75, 5.5);
        Course c2 = new InteractiveCourse("Data Science", "Bob", "2025-09-20", 90, 3);
        Course c3 = new ReadingCourse("Algorithms", "Carol", "2025-09-15", 150, 60);
        Course c4 = new CertificationCourse("AWS Cloud", "Dave", "2025-09-10", 2, true);

        c1.displayProgress();
        c2.displayProgress();
        c3.displayProgress();
        c4.displayProgress();
    }
}
