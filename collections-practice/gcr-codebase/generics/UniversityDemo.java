import java.util.*;

// Abstract course type
abstract class CourseType {
    String courseName;

    CourseType(String courseName) {
        this.courseName = courseName;
    }

    abstract void evaluate();
}

// Course types
class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }

    void evaluate() {
        System.out.println(courseName + " evaluated by exam");
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) {
        super(name);
    }

    void evaluate() {
        System.out.println(courseName + " evaluated by assignments");
    }
}

// Generic Course class
class Course<T extends CourseType> {
    List<T> courses = new ArrayList<>();

    void addCourse(T course) {
        courses.add(course);
    }

    List<T> getCourses() {
        return courses;
    }
}

// Utility class
class CourseUtil {
    static void evaluateAll(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            c.evaluate();
        }
    }
}

// Main
public class UniversityDemo {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Maths"));

        CourseUtil.evaluateAll(examCourses.getCourses());
    }
}
