package chapter_7;

import grade.Grade;

public class GradeBookTest {
    public static void main(String[] args) {
        int [] grades = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        GradeBook grade = new GradeBook("introduction to java",grades);
        System.out.println(grade.getCourseName());
        grade.processGrade();
    }
}
