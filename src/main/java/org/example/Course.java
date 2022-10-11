package org.example;

public class Course {
    private String courseCode;

    private int numCredit;

    private boolean studyAgain;

    public Course(String courseCode, int numCredit, boolean studyAgain) {
        this.courseCode = courseCode;
        this.numCredit = numCredit;
        this.studyAgain = studyAgain;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getNumCredit() {
        return numCredit;
    }

    public void setNumCredit(int numCredit) {
        this.numCredit = numCredit;
    }

    public boolean isStudyAgain() {
        return studyAgain;
    }

    public void setStudyAgain(boolean studyAgain) {
        this.studyAgain = studyAgain;
    }
}
