import java.util.ArrayList;

public class CourseArray {
    private static CourseArray instance;
    private ArrayList<Course> courses;

    public CourseArray() {
        this.courses = new ArrayList<Course>();
    }

    public static CourseArray getInstance() {
        if (instance == null) {
            instance = new CourseArray();
        }
        return instance;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public Course findCourse(String name){
        for (Course course : courses) {
            if (course.getName().equals(name)) {
                return course;
            }
        }
        return null;
    }
}
