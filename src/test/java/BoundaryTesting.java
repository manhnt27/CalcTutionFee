import org.example.Course;
import org.example.Student;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class BoundaryTesting {
    @Test
    public void test1() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_123", 1, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 270000", result);
    }

    @Test
    public void test2() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_123", 1, false));
        courses.add(new Course("INT_124", 1, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 540000", result);
    }

    @Test
    public void test3() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_123", 4, false));
        courses.add(new Course("INT_124", 4, false));
        courses.add(new Course("INT_125", 4, false));
        courses.add(new Course("INT_126", 4, false));
        courses.add(new Course("INT_127", 3, false));
        courses.add(new Course("INT_128", 4, false));
        courses.add(new Course("INT_129", 4, false));
        courses.add(new Course("INT_130", 4, false));
        courses.add(new Course("INT_131", 4, false));
        courses.add(new Course("INT_132", 4, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 10530000", result);
    }

    @Test
    public void test4() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_123", 4, false));
        courses.add(new Course("INT_124", 4, false));
        courses.add(new Course("INT_125", 4, false));
        courses.add(new Course("INT_126", 4, false));
        courses.add(new Course("INT_127", 4, false));
        courses.add(new Course("INT_128", 4, false));
        courses.add(new Course("INT_129", 4, false));
        courses.add(new Course("INT_130", 4, false));
        courses.add(new Course("INT_131", 4, false));
        courses.add(new Course("INT_132", 2, false));
        courses.add(new Course("INT_133", 2, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 10800000", result);
    }

    @Test
    public void test5() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_1", 4, false));
        courses.add(new Course("INT_2", 2, false));
        courses.add(new Course("INT_3", 4, false));
        courses.add(new Course("INT_4", 2, false));
        courses.add(new Course("INT_5", 4, false));
        courses.add(new Course("INT_6", 4, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 5400000", result);
    }

    @Test
    public void test6() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_10", 4, false));
        courses.add(new Course("INT_11", 2, false));
        courses.add(new Course("INT_12", 4, false));
        courses.add(new Course("INT_13", 2, false));
        courses.add(new Course("INT_14", 4, false));
        courses.add(new Course("INT_15", 4, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 5400000", result);
    }
    @Test
    public void test7() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_1000", 4, false));
        courses.add(new Course("INT_1001", 2, false));
        courses.add(new Course("INT_1002", 4, false));
        courses.add(new Course("INT_1003", 2, false));
        courses.add(new Course("INT_1004", 4, false));
        courses.add(new Course("INT_1005", 4, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 5400000", result);
    }

    @Test
    public void test8() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_100", 4, false));
        courses.add(new Course("INT_101", 2, false));
        courses.add(new Course("INT_102", 4, false));
        courses.add(new Course("INT_103", 2, false));
        courses.add(new Course("INT_104", 4, false));
        courses.add(new Course("INT_105", 4, false));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 5400000", result);
    }

    @Test
    public void test9() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_1", 4, true));
        courses.add(new Course("INT_2", 2, true));
        courses.add(new Course("INT_3", 4, true));
        courses.add(new Course("INT_4", 2, true));
        courses.add(new Course("INT_5", 4, true));
        courses.add(new Course("INT_6", 4, true));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 8400000", result);
    }

    @Test
    public void test10() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_10", 4, true));
        courses.add(new Course("INT_11", 2, true));
        courses.add(new Course("INT_12", 4, true));
        courses.add(new Course("INT_13", 2, true));
        courses.add(new Course("INT_14", 4, true));
        courses.add(new Course("INT_15", 4, true));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 8400000", result);
    }

    @Test
    public void test11() {
        List<Course> courses = new LinkedList<>();
        courses.add(new Course("INT_100", 4, true));
        courses.add(new Course("INT_101", 2, true));
        courses.add(new Course("INT_102", 4, true));
        courses.add(new Course("INT_103", 2, true));
        courses.add(new Course("INT_104", 4, true));
        courses.add(new Course("INT_105", 4, true));

        Student student = new Student();
        String result = student.getTutionFee(courses);
        assertEquals("Total tution fee: 8400000", result);
    }

    @Test
    public void test13() {
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
}