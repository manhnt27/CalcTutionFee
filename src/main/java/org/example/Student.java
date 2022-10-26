package org.example;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Student {
    public String getTutionFee(List<Course> courses) {
        int totalCredits = 0;
        int tutionFee = 0;
        Set<String> courseCodeSet = new HashSet<>();
        for(Course course : courses) {
            totalCredits += course.getNumCredit();
            if (course.getCourseCode().length() > 8 ||
                    course.getCourseCode().length() < 5) {
                return "Len of course code must be between 5 and 8";
            }
            if (!courseCodeSet.contains(course.getCourseCode())) {
                courseCodeSet.add(course.getCourseCode());
            } else {
                return "Course code can not be duplicated";
            }
        }
        if (totalCredits > Constant.MAX_CREDIT) {
            return "Num of credits must not be greater than 40";
        }
        for(Course course : courses) {
            if (course.isStudyAgain()) {
                tutionFee += course.getNumCredit() * Constant.FEE_STUDY_AGAIN;
            } else {
                tutionFee += course.getNumCredit() *
                        Constant.FEE_FIRST_REGISTRATION;
            }
        }
        return ("Total tution fee: " + tutionFee);
    }
}
