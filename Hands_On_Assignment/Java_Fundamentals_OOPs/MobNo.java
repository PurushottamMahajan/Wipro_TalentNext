package tasksprograms;


import java.util.Scanner;

public class MobNo {

   
    public static String convertLettersToDigits(String input) {
        StringBuilder digits = new StringBuilder();
        input = input.toUpperCase();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else if (Character.isLetter(c)) {
                digits.append(letterToDigit(c));
            }
            
        }

        return digits.toString();
    }

   
    public static int letterToDigit(char letter) {
        switch (letter) {
            case 'A': case 'B': case 'C':
                return 2;
            case 'D': case 'E': case 'F':
                return 3;
            case 'G': case 'H': case 'I':
                return 4;
            case 'J': case 'K': case 'L':
                return 5;
            case 'M': case 'N': case 'O':
                return 6;
            case 'P': case 'Q': case 'R': case 'S':
                return 7;
            case 'T': case 'U': case 'V':
                return 8;
            case 'W': case 'X': case 'Y': case 'Z':
                return 9;
            default:
                return -1; // Invalid
        }
    }

    // Format the number as (XXX) XXX-XXXX
    public static String formatPhoneNumber(String digits) {
        return "(" + digits.substring(0, 3) + ") " + digits.substring(3, 6) + "-" + digits.substring(6, 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a phone number (may include letters): ");
        String input = scanner.nextLine();

        String digitsOnly = convertLettersToDigits(input);

        if (digitsOnly.length() != 10) {
            System.out.println("Error: The converted phone number must have exactly 10 digits. Got " + digitsOnly.length() + " digits.");
        } else {
            String formatted = formatPhoneNumber(digitsOnly);
            System.out.println("Converted phone number: " + formatted);
        }

        scanner.close();
    }
}