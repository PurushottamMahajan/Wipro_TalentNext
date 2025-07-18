package tasksprograms;
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, product = 1;
        int original = num;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        if (sum == product)
            System.out.println(original + " is a Spy Number.");
        else
            System.out.println(original + " is NOT a Spy Number.");

        sc.close();
    }
}
