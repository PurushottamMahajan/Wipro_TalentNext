package tasksprograms;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramNumbers {
    // Convert number to sorted char array
    static char[] getSortedDigits(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (Arrays.equals(getSortedDigits(num1), getSortedDigits(num2))) {
            System.out.println(num1 + " and " + num2 + " are Anagram Numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT Anagram Numbers.");
        }

        sc.close();
    }
}
