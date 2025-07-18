import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();


        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;  // Add last digit
                num /= 10;        // Remove last digit
            }
            num = sum;            // Assign new sum to num
        }

        System.out.println("Single digit sum: " + num);
        sc.close();
    }
}
