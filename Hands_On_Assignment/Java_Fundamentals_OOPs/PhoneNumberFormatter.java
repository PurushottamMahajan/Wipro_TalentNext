package tasksprograms;

import java.util.Scanner;

public class PhoneNumberFormatter {

    // Method to extract digits and format
    public static String extractAndFormat(String input) throws IllegalArgumentException {
        // Remove all non-digit characters
        String digitsOnly = input.replaceAll("[^0-9]", "");

        if (digitsOnly.length() != 10) {
            throw new IllegalArgumentException("Invalid input! Mobile number must contain exactly 10 digits.");
        }

        // Format as (XXX)-XXX-XXXX
        String formatted = "(" + digitsOnly.substring(0, 3) + ")-" +
                           digitsOnly.substring(3, 6) + "-" +
                           digitsOnly.substring(6);
        return formatted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mobile number (with letters/symbols): ");
        String input = sc.nextLine();

        try {
            String formatted = extractAndFormat(input);
            System.out.println("Formatted Number: " + formatted);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

