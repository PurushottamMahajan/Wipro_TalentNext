package tasksprograms;
public class ReverseString {
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "hello hello";
        System.out.println("Reversed string: " + reverse(input));  // Output: "olleh"
    }
}
