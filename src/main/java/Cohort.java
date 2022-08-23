import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private ArrayList<Student> students;

    public Cohort() {
        this.students = new ArrayList<>();
    }

    public double getCohortAverage() {
        double avg = 0;
        for (Student student: this.getStudents()) {
            avg += student.getGradeAverage();
        }
        return avg / this.getStudents().size();
    }

    public void addStudent(Student student){students.add(student);}

    public ArrayList<Student> getStudents() {

        return students;
    }
}