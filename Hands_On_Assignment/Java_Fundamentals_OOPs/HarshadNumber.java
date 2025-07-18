package tasksprograms;
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        if (original % sum == 0)
            System.out.println(original + " is a Harshad Number.");
        else
            System.out.println(original + " is NOT a Harshad Number.");

        sc.close();
    }
}
