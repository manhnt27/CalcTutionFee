package org.example;

import java.util.List;

public class Student {
    public String getTutionFee(List<Course> courses) {

        int totalCredits = 0;
        int tutionFee = 0;

        for(Course course : courses) {
            totalCredits += course.getNumCredit();
        }

        if (totalCredits > Constant.MAX_CREDIT) {
            return "Num of credits must not be greater than 40";
        }
        for(Course course : courses) {
            if (course.isStudyAgain()) {
                tutionFee += course.getNumCredit() * Constant.FEE_STUDY_AGAIN;
            } else {
                tutionFee += course.getNumCredit() * Constant.FEE_FIRST_REGISTRATION;
            }
        }
        return ("Total tution fee: " + tutionFee);
    }
}
