package tasksprograms;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);

        System.out.print("Enter first number: ");
        double num3 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num4 = scanner.nextDouble();
        double sum2 = num1 + num2;
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}