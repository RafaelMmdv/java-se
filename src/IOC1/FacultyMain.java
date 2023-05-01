package IOC1;

public class FacultyMain {

    public static void main(String[] args) {

        Faculty faculty = new Group1();
        Exam exam = new FacultyExam(faculty);
        exam.groupExam();
    }
}
