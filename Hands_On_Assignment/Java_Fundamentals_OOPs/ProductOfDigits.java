package tasksprograms;
import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;
        int temp = num;

        while (temp != 0) {
            product *= temp % 10;
            temp /= 10;
        }

        System.out.println("Product of digits of " + num + " is: " + product);
        sc.close();
    }
}
