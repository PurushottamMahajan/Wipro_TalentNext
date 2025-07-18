package taskprograms.Mini_Project.GradeCalculationSystem.mile1.main;

import taskprograms.Mini_Project.GradeCalculationSystem.mile1.bean.Student;
import taskprograms.Mini_Project.GradeCalculationSystem.mile1.exception.NullMarksArrayException;
import taskprograms.Mini_Project.GradeCalculationSystem.mile1.exception.NullNameException;
import taskprograms.Mini_Project.GradeCalculationSystem.mile1.exception.NullStudentObjectException;
import taskprograms.Mini_Project.GradeCalculationSystem.mile1.service.StudentReport;
import taskprograms.Mini_Project.GradeCalculationSystem.mile1.service.StudentService;

public class StudentMain {
    static Student[] data = new Student[4];

    StudentMain() {
        for (int i = 0; i < data.length; i++) {
            data[i] = new Student();
        }

        // Initialize the objects with valid names
        data[0] = new Student("Sekar", new int[] {85, 75, 95},null);
        data[1] = new Student("John", new int[] {11, 22, 33},null); // Changed from null to "John"
        data[2] = new Student("Sekar", new int[] {85, 75, 95},null);
        data[3] = new Student("John", new int[] {11, 22, 33},null); // Changed from null to "John"
       
    }

    public static void main(String[] args) {
        StudentMain studentMain = new StudentMain();
        StudentReport studentReport = new StudentReport();
        StudentService studentService = new StudentService();

        // 1) Call the validate method for all the objects available in data array
        for (Student student : data) {
            try {
                String validationResult = studentReport.validate(student);
                System.out.println("Validation result: " + validationResult);
                // 3) If validate method returns "VALID", then call the findGrades method & print the result
                if ("VALID".equals(validationResult)) {
                    String grade = studentReport.findGrades(student);
                    System.out.println("Grade: " + grade);
                }
            } catch (NullStudentObjectException | NullNameException | NullMarksArrayException e) {
                e.printStackTrace();
            }
        }

        // Create StudentService Object
        // Call the above object, Call the findNumberOfNullMarksArray(data) method and print the result
        int nullMarksCount = studentService.findNumberOfNullMarksArray(data);
        System.out.println("Number of null marks arrays: " + nullMarksCount);

        // Call the findNumberOfNullName(data) method and print the result
        int nullNameCount = studentService.findNumberOfNullName(data);
        System.out.println("Number of null names: " + nullNameCount);

        // Call the findNumberOfNullObjects(data) method and print the result
        int nullObjectsCount = studentService.findNumberOfNullObjects(data);
        System.out.println("Number of null objects: " + nullObjectsCount);
    }
}