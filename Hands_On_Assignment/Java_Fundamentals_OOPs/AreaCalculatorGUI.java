package tasksprograms;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// Abstract class
public class AreaCalculatorGUI extends JFrame implements ActionListener {

    // --- Shape & subclasses as inner classes below ---
    abstract class Shape {
        abstract double calculateArea();
    }

    class Triangle extends Shape {
        double base, height;
        Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }
        double calculateArea() {
            return 0.5 * base * height;
        }
    }

    class Rectangle extends Shape {
        int length, width;
        Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }
        double calculateArea() {
            return length * width;
        }
    }

    class Circle extends Shape {
        float radius;
        Circle(float radius) {
            this.radius = radius;
        }
        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    class Square extends Shape {
        int side;
        Square(int side) {
            this.side = side;
        }
        double calculateArea() {
            return side * side;
        }
    }

    JComboBox<String> shapeBox;
    JTextField input1, input2;
    JLabel label1, label2, resultLabel;
    JButton calculateBtn;

    public AreaCalculatorGUI() {
        setTitle("Area Calculator");
        setSize(1550, 1250);
        setLayout(new GridLayout(6, 2, 10, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Shape dropdown
        shapeBox = new JComboBox<>(new String[]{"Triangle", "Rectangle", "Circle", "Square"});
        shapeBox.addActionListener(this);

        label1 = new JLabel("Value 1:");
        label2 = new JLabel("Value 2:");
        input1 = new JTextField();
        input2 = new JTextField();
        calculateBtn = new JButton("Calculate Area");
        resultLabel = new JLabel("Area: ");

        add(new JLabel("Select Shape:"));
        add(shapeBox);
        add(label1);
        add(input1);
        add(label2);
        add(input2);
        add(new JLabel(""));
        add(calculateBtn);
        add(new JLabel(""));
        add(resultLabel);

        calculateBtn.addActionListener(this);
        updateInputFields();

        setVisible(true);
    }

    public void updateInputFields() {
        String selected = (String) shapeBox.getSelectedItem();
        if (selected.equals("Triangle")) {
            label1.setText("Base:");
            label2.setText("Height:");
            input1.setEnabled(true);
            input2.setEnabled(true);
        } else if (selected.equals("Rectangle")) {
            label1.setText("Length:");
            label2.setText("Width:");
            input1.setEnabled(true);
            input2.setEnabled(true);
        } else if (selected.equals("Circle")) {
            label1.setText("Radius:");
            label2.setText("-");
            input1.setEnabled(true);
            input2.setEnabled(false);
            input2.setText("");
        } else if (selected.equals("Square")) {
            label1.setText("Side:");
            label2.setText("-");
            input1.setEnabled(true);
            input2.setEnabled(false);
            input2.setText("");
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == shapeBox) {
            updateInputFields();
        } else if (e.getSource() == calculateBtn) {
            try {
                String shape = (String) shapeBox.getSelectedItem();
                double area = 0;

                switch (shape) {
                    case "Triangle":
                        double base = Double.parseDouble(input1.getText());
                        double height = Double.parseDouble(input2.getText());
                        area = new Triangle(base, height).calculateArea();
                        break;
                    case "Rectangle":
                        int length = Integer.parseInt(input1.getText());
                        int width = Integer.parseInt(input2.getText());
                        area = new Rectangle(length, width).calculateArea();
                        break;
                    case "Circle":
                        float radius = Float.parseFloat(input1.getText());
                        area = new Circle(radius).calculateArea();
                        break;
                    case "Square":
                        int side = Integer.parseInt(input1.getText());
                        area = new Square(side).calculateArea();
                        break;
                }

                resultLabel.setText("Area: " + String.format("%.2f", area));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid inputs!");
            }
        }
    }

    public static void main(String[] args) {
        new AreaCalculatorGUI();
    }
}
