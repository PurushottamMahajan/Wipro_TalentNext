package tasksprograms;
import java.util.Scanner;

class Student {
    int id;
    String name;
    float percentage;

    // Constructor
    Student(int id, String name, float percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Percentage: " + percentage + "%");
    }
}

public class ArrayOfObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n]; // Create array of Student objects

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume leftover newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Percentage: ");
            float percentage = sc.nextFloat();

            students[i] = new Student(id, name, percentage); // Create object and store in array
        }

        // Display all student details
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}