import org.example.Course;
import org.example.Student;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EquivalentTesting {
    @Test
    public void test1() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_123", 1, false));
        courses.add(new Course("INT_123", 2, false));
        courses.add(new Course("INT_124", 3, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Course code can not be duplicated", result);
    }

    @Test
    public void test2() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_123", 1, false));
        courses.add(new Course("INT_124", 3, false));
        courses.add(new Course("INT_125", 1, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 1350000", result);
    }

    @Test
    public void test3() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_123", 1, true));
        courses.add(new Course("INT_123", 2, true));
        courses.add(new Course("INT_124", 3, true));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Course code can not be duplicated", result);
    }

    @Test
    public void test4() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_123", 1, false));
        courses.add(new Course("INT_124", 3, false));
        courses.add(new Course("INT_125", 1, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 1350000", result);
    }
}
