package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCourses = input.nextInt();
        List<Course> courses = new LinkedList<>();

        final int FEE_FIRST_REGISTRATION = 270000;
        final int FEE_STUDY_AGAIN = 420000;
        final int MAX_CREDIT = 40;
        int totalCredits = 0;
        int tutionFee = 0;
        Set<String> courseCodeSet = new HashSet<>();

        for(int i = 0; i < numCourses; i++) {
            String courseCode = input.next();
            int numCredit = input.nextInt();
            boolean studyAgain = input.nextBoolean();
            totalCredits += numCredit;
            courses.add(new Course(courseCode, numCredit, studyAgain));

        }

        if (totalCredits > MAX_CREDIT) {
            System.out.println("Num of credits must not be greater than 40");
        }
        for(Course course : courses) {
            if (course.isStudyAgain()) {
                tutionFee += course.getNumCredit() * FEE_STUDY_AGAIN;
            } else {
                tutionFee += course.getNumCredit() * FEE_FIRST_REGISTRATION;
            }
        }

    }
}