public class DisplayDigitSeparately {
    public static void main(String[] args) {
     displayDigits(10864);
    }

    // Test Capsule- 2
    // Design an algorithm that accepts a number and displays each digit of the number separately
    public static void displayDigits(int number) {
        String s = String.valueOf(number);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                continue;
            }
            System.out.println(s.charAt(i));
        }
    }
}