package tasksprograms;
import java.util.Scanner;
public class LastDigitAdder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Get last digits
        int lastDigit1 = Math.abs(num1 % 10);
        int lastDigit2 = Math.abs(num2 % 10);

        // Sum of last digits
        int sum = lastDigit1 + lastDigit2;

        // Output
        System.out.println("Last digit of " + num1 + " is: " + lastDigit1);
        System.out.println("Last digit of " + num2 + " is: " + lastDigit2);
        System.out.println("Sum of last digits = " + sum);

        sc.close();
    }
}
