import org.example.Course;
import org.example.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestJunit {
    @Test
    public void test1() {
        List<Course> courses = new LinkedList<>();

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("asngv", result);
    }

    @Test
    public void test2() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_123", 1, true));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("asngv", result);
    }
}