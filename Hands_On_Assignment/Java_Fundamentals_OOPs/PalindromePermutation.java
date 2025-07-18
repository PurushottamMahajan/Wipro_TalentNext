package tasksprograms;
public class PalindromePermutation {
    public static boolean canFormPalindrome(String s) {
        int[] freq = new int[128]; // ASCII
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                freq[Character.toLowerCase(c)]++;
            }
        }

        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

    public static void main(String[] args) {
        String input = "tactcoa";
        System.out.println("Can be rearranged into palindrome? " + canFormPalindrome(input)); // true
    }
}
