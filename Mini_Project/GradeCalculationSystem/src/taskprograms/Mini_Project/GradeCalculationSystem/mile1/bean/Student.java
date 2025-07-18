package taskprograms.Mini_Project.GradeCalculationSystem.mile1.bean;

public class Student {
    private String name;
    private int[] marks;
    private String grade;

    public Student() {
        // Auto-generated constructor
    }

    public Student(String name, int[] marks, String grade) {
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }

    // Auto-generated getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}