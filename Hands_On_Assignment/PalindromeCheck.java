public class PalindromeCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int original = num;
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        if (original == reversed)
            System.out.println(original + " is a palindrome");
        else
            System.out.println(original + " is not a palindrome");
    }
}