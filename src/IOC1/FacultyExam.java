package IOC1;

public class FacultyExam implements Exam {

    Faculty faculty;

    public FacultyExam(Faculty faculty){

        this.faculty = faculty;
    }


    @Override
    public void groupExam() {
        String examStart = faculty.start();

    }
}
