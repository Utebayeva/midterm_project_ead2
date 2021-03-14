import java.util.ArrayList;

public class StudentArray {
    private static StudentArray instance;
    private ArrayList<Student> students;

    public StudentArray() {
        this.students = new ArrayList<Student>();
    }

    public static StudentArray getInstance() {
        if (instance == null) {
            instance = new StudentArray();
        }
        return instance;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Student findStudent(String login){
        for (Student student : students) {
            if (student.getUsername().equals(login)) {
                return student;
            }
        }
        return null;
    }
}
