package tasksprograms;
import java.io.*;
abstract class Shape {
    abstract void input(BufferedReader br) throws IOException;  
    abstract void calculate();                                   // Calculate area
}

// Triangle class
class Triangle extends Shape {
    private double base, height;

    void input(BufferedReader br) throws IOException {
        System.out.print("Enter base of triangle (double): ");
        base = Double.parseDouble(br.readLine());
        System.out.print("Enter height of triangle (double): ");
        height = Double.parseDouble(br.readLine());
    }

    void calculate() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    private int length, width;

    void input(BufferedReader br) throws IOException {
        System.out.print("Enter length of rectangle (int): ");
        length = Integer.parseInt(br.readLine());
        System.out.print("Enter width of rectangle (int): ");
        width = Integer.parseInt(br.readLine());
    }

    void calculate() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Circle class
class Circle extends Shape {
    private float radius;

    void input(BufferedReader br) throws IOException {
        System.out.print("Enter radius of circle (float): ");
        radius = Float.parseFloat(br.readLine());
    }

    void calculate() {
        float area = (float)(Math.PI * radius * radius);
        System.out.println("Area of Circle: " + area);
    }
}

// Square class
class Square extends Shape {
    private int side;

    void input(BufferedReader br) throws IOException {
        System.out.print("Enter side of square (int): ");
        side = Integer.parseInt(br.readLine());
    }

    void calculate() {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

// Main class
public class Area {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Shape shape;
        int choice;

        do {
            System.out.println("\n=== Area Calculation Menu ===");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Square");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    shape = new Triangle();
                    break;
                case 2:
                    shape = new Rectangle();
                    break;
                case 3:
                    shape = new Circle();
                    break;
                case 4:
                    shape = new Square();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            shape.input(br);
            shape.calculate();

        } while (true);
    }
}
