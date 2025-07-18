package tasksprograms;
import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        String squareStr = String.valueOf(square);
        int len = squareStr.length();

        String left = squareStr.substring(0, len / 2);
        String right = squareStr.substring(len / 2);

        int leftPart = (left.isEmpty()) ? 0 : Integer.parseInt(left);
        int rightPart = (right.isEmpty()) ? 0 : Integer.parseInt(right);

        if (leftPart + rightPart == num)
            System.out.println(num + " is a Kaprekar Number.");
        else
            System.out.println(num + " is NOT a Kaprekar Number.");

        sc.close();
    }
}
