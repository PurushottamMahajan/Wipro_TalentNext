package taskprograms.Mini_Project.GradeCalculationSystem.mile1.service;

import taskprograms.Mini_Project.GradeCalculationSystem.mile1.bean.Student;
import taskprograms.Mini_Project.GradeCalculationSystem.mile1.exception.NullMarksArrayException;
import taskprograms.Mini_Project.GradeCalculationSystem.mile1.exception.NullNameException;
import taskprograms.Mini_Project.GradeCalculationSystem.mile1.exception.NullStudentObjectException;

public class StudentReport {
    public String findGrades(Student studentObject) {
        if (studentObject == null) return null;

        int[] marks = studentObject.getMarks();
        if (marks == null) return null;

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        if (sum < 150) return "F";
        else if (sum < 200) return "C";
        else if (sum < 250) return "B";
        else if (sum < 300) return "A";
        else return "A+";
    }

    public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
        if (s == null) throw new NullStudentObjectException();
        if (s.getName() == null) throw new NullNameException();
        if (s.getMarks() == null) throw new NullMarksArrayException();
        return "VALID";
    }
}