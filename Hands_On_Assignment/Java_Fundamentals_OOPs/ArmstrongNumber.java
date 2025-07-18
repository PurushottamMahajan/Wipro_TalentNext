package tasksprograms;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = sc.nextInt();
        
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        if (sum == originalNumber)
            System.out.println(originalNumber + " is an Armstrong number.");
        else
            System.out.println(originalNumber + " is NOT an Armstrong number.");

        sc.close();
    }
}
