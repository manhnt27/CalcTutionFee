import org.example.Course;
import org.example.Student;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class All_C_Uses_SomeP_Uses {
    @Test
    public void test1() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_123", 10, false));
        courses.add(new Course("INT_124", 10, false));
        courses.add(new Course("INT_125", 10, false));
        courses.add(new Course("INT_126", 12, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Num of credits must not be greater than 40", result);
    }

    @Test
    public void test2() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_1000", 4, true));
        courses.add(new Course("INT_1001", 2, true));
        courses.add(new Course("INT_1002", 4, true));
        courses.add(new Course("INT_1003", 2, true));
        courses.add(new Course("INT_1004", 4, true));
        courses.add(new Course("INT_1005", 4, true));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 8400000", result);
    }

    @Test
    public void test3() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_123", 1, false));
        courses.add(new Course("INT_124", 3, false));
        courses.add(new Course("INT_125", 1, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 1350000", result);
    }

    @Test
    public void test4() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_123", 1, false));
        courses.add(new Course("INT_124", 3, true));
        courses.add(new Course("INT_125", 3, false));
        courses.add(new Course("INT_126", 4, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 3420000", result);
    }

}
