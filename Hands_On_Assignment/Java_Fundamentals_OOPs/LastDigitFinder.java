package tasksprograms;

public class LastDigitFinder {
    public static int getLastDigit(int number) {
        return Math.abs(number % 10);
    }

    public static void main(String[] args) {
        int num = -327;
        System.out.println("Last digit: " + getLastDigit(num));  // Output: 7
    }
}
